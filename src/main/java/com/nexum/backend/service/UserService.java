package com.nexum.backend.service;

import com.nexum.backend.dao.UserDAO;
import com.nexum.backend.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserDTO getUser(Long id) {
        return userDAO.findById(id).orElse(null);
    }

    public List<UserDTO> getAllUsers() {
        return (List<UserDTO>) userDAO.findAll();
    }

    public void addUser(UserDTO user) {
        userDAO.save(user);
    }

    public void deleteUser(Long id) {
        userDAO.deleteById(id);
    }
}
