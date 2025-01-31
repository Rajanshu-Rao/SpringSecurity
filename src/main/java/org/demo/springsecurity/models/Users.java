package org.demo.springsecurity.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Users extends BaseModel {
    private String email;
    private String password;
    }
