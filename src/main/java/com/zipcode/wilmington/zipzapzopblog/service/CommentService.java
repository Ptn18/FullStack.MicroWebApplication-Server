package com.zipcode.wilmington.zipzapzopblog.service;


import com.zipcode.wilmington.zipzapzopblog.model.Comment;
import com.zipcode.wilmington.zipzapzopblog.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class CommentService {

    private CommentRepo commrepository;


    @Autowired

    public CommentService(CommentRepo commrepository) {
        this.commrepository = commrepository;
    }

    private List<Comment> comments = new ArrayList<Comment>();


    public Comment createComment(Comment comment) {
        //this.comments.add(comment);
        return commrepository.saveAndFlush(comment);
    }


    public Boolean delete(Long id) {


        commrepository.deleteById(id);
        return true;
    }


    public Comment edit(Long id, Comment comment) {
        Comment originalcomment = commrepository.findById(id).get();
        originalcomment.setBody(comment.getBody());
        originalcomment.setCreationDate(comment.getCreationDate());
        return commrepository.save(originalcomment);
    }


    public Comment putpostAndUser(Long id, Comment comment) {

        Comment comm = new Comment();
        Long post_id=  comment.getPost().getId();
        Long user_id=  comment.getUser().getId();
        Comment originalcomment = commrepository.findById(id).get();
        originalcomment.setPost(comment.getPost());
        originalcomment.setUser(comment.getUser());
        return commrepository.save(originalcomment);
    }









    public Comment show(Long id) {


        return commrepository.findById(id).get();
    }

    public Iterable<Comment> index()

    {
        return commrepository.findAll();


    }


    public List<Comment>findCommentbyPostId(Long id) {


        return commrepository.findCommentsByPostId(id);
    }


    public List<Comment>findCommentbyCreationDate(Date date) {


        return commrepository.findCommentsByCreationDate(date);
    }








}










