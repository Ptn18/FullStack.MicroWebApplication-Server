package com.zipcode.wilmington.zipzapzopblog.repository;

import com.zipcode.wilmington.zipzapzopblog.model.Post;
import com.zipcode.wilmington.zipzapzopblog.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    Page<Post> findByUserOrderByCreateDateDesc(User user, Pageable pageable);

    List<Post> findByOrderByCreateDateDesc();
}

