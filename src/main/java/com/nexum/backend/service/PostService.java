package com.nexum.backend.service;

import com.nexum.backend.dao.PostDAO;
import com.nexum.backend.dto.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostDAO postDAO;

    public List<PostDTO> getAll() {
        return (List<PostDTO>) postDAO.findAll();
    }


    public void addPost(PostDTO post) {
        postDAO.save(post);
    }

    public void deletePost(Long id) {
        postDAO.deleteById(id);
    }
}
