package com.example.repo;

import com.example.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;


public interface SearchRepo
{
    List<Post> findAll(String text);

}
