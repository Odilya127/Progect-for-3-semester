package com.nexum.backend.dao;

import com.nexum.backend.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<UserDTO, Long> {
}
