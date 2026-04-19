package com.example.repo;

import com.example.model.Post;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.json.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchImpl implements SearchRepo {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoConverter converter;

    @Override
    public List<Post> findAll(String text) {

        List<Post> posts = new ArrayList<>();

        List<Document> pipeline = Arrays.asList(
                new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("desc", "techs", "profile"))
                        )
                ),
                new Document("$sort", new Document("exp", 1)),
                new Document("$limit", 5)
        );

        mongoTemplate.getCollection("jobs")
                .aggregate(pipeline)
                .forEach(doc -> posts.add(converter.read(Post.class, doc)));

        return posts;
    }
}