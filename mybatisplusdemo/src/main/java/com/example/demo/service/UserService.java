package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value="UserService")
public class UserService{
    @Autowired
    public UserMapper userMapper;

    public List<User> getAllUsers(QueryWrapper<User>wrapper){
//selectList()方法是mybatisplus自带方法
        return userMapper.selectList(wrapper);
    }
}
