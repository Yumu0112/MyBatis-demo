package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;

public class UserResponse {

//    nameのみをレスポンスとして返却するクラス
    private String name;

    public UserResponse(User name) {
        this.name = name.getName();
    }

    public String getName() {
        return  name;
    }
}
