package com.zipcode.wilmington.zipzapzopblog.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserModelTest {

    private User user;

    @Before
    public void setup() {
        user = new User();
    }

    @Test
    public void setUserEmailTest() {
        //given
        String expectedEmail = "m@gmail.com";
        //when
        user.setEmail(expectedEmail);
        String actual = user.getEmail();
        //then
        Assert.assertEquals(expectedEmail, actual);

    }

    @Test
    public void setUserPasswordTest() {
        //given
        String expectedPassword = "12345";
        //when
        user.setPassword(expectedPassword);
        String actual = user.getPassword();
        //then
        Assert.assertEquals(expectedPassword, actual);

    }

    @Test
    public void setUserUsernameTest() {
        //given
        String expectedUsername = "mb";
        //when
        user.setUsername(expectedUsername);
        String actual = user.getUsername();
        //then
        Assert.assertEquals(expectedUsername, actual);

    }

    @Test
    public void setUserFirstNameTest() {
        //given
        String expectedName = "mama";
        //when
        user.setFirstName(expectedName);
        String actual = user.getFirstName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void setUserLastNameTest() {
        //given
        String expectedLasName = "bama";
        //when
        user.setLastName(expectedLasName);
        String actual = user.getLastName();
        //then
        Assert.assertEquals(expectedLasName, actual);

    }
}
