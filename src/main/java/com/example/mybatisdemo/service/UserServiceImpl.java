package com.example.mybatisdemo.service;

import com.example.mybatisdemo.mapper.UserMapper;
import com.example.mybatisdemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public List<User> findUser() {
        return userMapper.findUser();
    }
}
