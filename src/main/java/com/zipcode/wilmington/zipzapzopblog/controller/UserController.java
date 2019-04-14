package com.zipcode.wilmington.zipzapzopblog.controller;

import com.zipcode.wilmington.zipzapzopblog.model.User;
import com.zipcode.wilmington.zipzapzopblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private UserService service;

    @Autowired
    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> allUsers(){
        return new ResponseEntity<>(service.showAll(), HttpStatus.OK);
    }




}
