package com.zipcode.wilmington.zipzapzopblog.service;

import com.zipcode.wilmington.zipzapzopblog.model.User;
import com.zipcode.wilmington.zipzapzopblog.repository.UserRepo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void createTest(){
        //given
        User user = new User("m@gmail.com", "23434", "mbrahma","m","b" );

        //mock
        UserRepo userRepo = mock(UserRepo.class);

        //expected data
        Long expectedId = 5l;
        User userToReturn = new User("m@gmail.com", "23434", "mbrahma","m","b" );
        userToReturn.setId(expectedId);

        // when the method save is called with the user
        // then return the created user
        when(userRepo.save(user)).thenReturn(userToReturn);

        // create class to test
        UserService userService = new UserService(userRepo);

        // call the method to test
        User actual = userService.save(user);

        //verify the result
        Assert.assertEquals(expectedId, actual.getId());

    }

    @Test
    public void updateTest(){
        //given
        User userToReturn = new User("m@gmail.com", "23434", "mbrahma","m","b" );
        userToReturn.setId(1L);

        //mock
        UserRepo userRepo = mock(UserRepo.class);

        // when actions
        when(userRepo.findById(1L)).thenReturn(Optional.of(userToReturn));
        // create class to test
        UserService userService = new UserService(userRepo);
        User user = userRepo.findById(1L).get();


        // call the method to test
        User actual = userService.update(user);

        // Make sure the method save got call with the person
        verify(userRepo).save(user);
    }

    @Test
    public void showTest(){

    }





}
