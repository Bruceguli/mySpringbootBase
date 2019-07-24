package com.example.hotel.myHotel.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lenovo on 2019/3/24.
 */
@Mapper
public interface UserMapper {

//注解的作用就是告诉mybatis框架,执行括号内的sql语句
    @Select("select name from user where id=#{userId}")
// @Param注解的作用是给参数命名,参数命名后就能根据名字得到参数值,正确的将参数传入sql语句中
    String getUserName(@Param("userId") Long userId);


}
