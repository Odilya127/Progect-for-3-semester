package com.nexum.backend.controller;

import com.nexum.backend.dto.PostDTO;
import com.nexum.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public List<PostDTO> getAll(){
        return postService.getAll();
    }

    @PostMapping("/add")
    public void addPost(@RequestBody(required = false) PostDTO post) {
        postService.addPost(post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable  Long id) {
        postService.deletePost(id);
    }
}
