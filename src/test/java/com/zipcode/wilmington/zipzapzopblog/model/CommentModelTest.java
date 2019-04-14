package com.zipcode.wilmington.zipzapzopblog.model;

import org.junit.Assert;
import org.junit.Test;

public class CommentModelTest {
    @Test
    public void CommentSetBodyTest() {
        //given
        String expected = "This is my comment";
        Comment newComment = new Comment();
        //when
        newComment.setBody(expected);
        String actual = newComment.getBody();
        //then
        Assert.assertEquals(expected,actual);
    }
}
