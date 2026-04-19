package com.example.repo;

import com.example.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface PostRepo extends MongoRepository<Post,String>
{

}
