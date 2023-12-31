package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
        @Select("SELECT * FROM users")
        List<User> findUser();
}

