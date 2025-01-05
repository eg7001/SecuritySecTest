package com.pdox.springsectest.repo;

import com.pdox.springsectest.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer>{
    Users findByUsername(String username);

}
