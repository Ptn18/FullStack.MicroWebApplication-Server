package com.zipcode.wilmington.zipzapzopblog.controller;

import com.zipcode.wilmington.zipzapzopblog.model.User;
import com.zipcode.wilmington.zipzapzopblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/user/{id}")
    public ResponseEntity<User> showUser(@PathVariable Long id) {
        Optional<User> optional = service.show(id);
        if (optional.isPresent()) {
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        } else{
            throw new IllegalArgumentException();
        }
    }




}
