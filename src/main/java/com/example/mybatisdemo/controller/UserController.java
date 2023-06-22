package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> users() {
        return userService.findUser();
    }

//    UserResponseを使ってnameだけを表示する
//    controllerで処理をハンドリング
    @GetMapping("/users/index")
    public List<UserResponse> usersIndex() {
        List<User> users = userService.findUser();
        List<UserResponse> userResponses = users.stream().map(UserResponse::new).toList();

        return userResponses;
    }
}
