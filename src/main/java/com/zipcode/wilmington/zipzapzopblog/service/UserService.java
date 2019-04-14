package com.zipcode.wilmington.zipzapzopblog.service;

import com.zipcode.wilmington.zipzapzopblog.model.User;
import com.zipcode.wilmington.zipzapzopblog.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public Optional<User>  show(Long id){
        return userRepo.findById(id);
    }

    public List<User> showAll(){ return userRepo.findAll();}

    public User save(User user){
        return userRepo.save(user);
    }

    public Boolean delete(Long id){
        userRepo.deleteById(id);
        return true;
    }

    public User update(User user){
        User originalUser = userRepo.findById(user.getId()).get();
        originalUser.setEmail(user.getEmail());
        originalUser.setFirstName(user.getFirstName());
        originalUser.setLastName(user.getLastName());
        return userRepo.save(originalUser);
    }

    public Optional<User> findByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public Optional<User> findByEmail(String email){
        return userRepo.findByEmail(email);
    }

}
