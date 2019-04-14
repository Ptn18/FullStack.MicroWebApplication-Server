package com.zipcode.wilmington.zipzapzopblog.repository;


import com.zipcode.wilmington.zipzapzopblog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment,  Long> {

    @Query(value="select * from comment c where c.post_id = ?1", nativeQuery=true)
   List<Comment> findCommentsByPostId(Long id);

    @Query(value="select * from comment c where c.create_date = ?1", nativeQuery=true)
    List<Comment> findCommentsByCreationDate(Date date);




}

