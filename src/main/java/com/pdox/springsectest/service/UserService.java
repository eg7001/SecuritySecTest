package com.pdox.springsectest.service;

import com.pdox.springsectest.models.Users;
import com.pdox.springsectest.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Users register(Users user){
        return userRepo.save(user);
    }
}
