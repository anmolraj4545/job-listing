package com.example.controller;

import com.example.model.Post;
import com.example.repo.PostRepo;
import com.example.repo.SearchRepo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController
{

    @Autowired
    private PostRepo repo;

    @Autowired
    private SearchRepo searchRep;

//    @RequestMapping(value = "/")
//    public void redirect(HttpServletResponse response) throws IOException {
//        response.sendRedirect("/swagger-ui/index.html");
//    }

    @GetMapping("/posts")
    public List<Post> getAllPost()
    {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return searchRep.findAll(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }



}
