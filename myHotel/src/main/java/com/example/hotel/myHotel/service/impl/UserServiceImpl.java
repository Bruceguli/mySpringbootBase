package com.example.hotel.myHotel.service.impl;

import com.example.hotel.myHotel.mapper.UserMapper;
import com.example.hotel.myHotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2019/3/24.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserName(Long userId) {
        return userMapper.getUserName(userId);
    }
}
