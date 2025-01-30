package com.pdox.springsectest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Users {
    @Id
    private int id;
    private String username;
    private String password;
}
