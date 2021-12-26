package com.nexum.backend.dao;

import com.nexum.backend.dto.PostDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDAO extends CrudRepository<PostDTO, Long> {

}
