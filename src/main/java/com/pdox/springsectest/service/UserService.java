package com.pdox.springsectest.service;

import com.pdox.springsectest.models.Users;
import com.pdox.springsectest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    AuthenticationManager authManager;

    @Autowired
    private JWTService jwtService;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Users register(Users user){
        return userRepo.save(user);
    }
    public String verify(Users user){
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername());
        }
        return "NUHH UHHH";
    }
}
