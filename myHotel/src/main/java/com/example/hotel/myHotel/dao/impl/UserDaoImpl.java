package com.example.hotel.myHotel.dao.impl;

import com.example.hotel.myHotel.dao.UserDao;
import com.example.hotel.myHotel.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2019/3/24.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserName(Long userId) {
        return userMapper.getUserName(userId);
    }
}
