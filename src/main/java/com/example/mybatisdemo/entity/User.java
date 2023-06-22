package com.example.mybatisdemo.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private int id;
    private String name;

    public User(int id, String name, String email, Date purchaseDate, int price) {
        this.id = id;
        this.name = name;
    }
}
