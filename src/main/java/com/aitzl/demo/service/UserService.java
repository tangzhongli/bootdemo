package com.aitzl.demo.service;

import com.aitzl.demo.entity.User;
import com.aitzl.demo.mapper.UserMapper;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: Zhongli·Tang
 * @Date: 2020-10-18 11:44
 * @Version: v1.0.0
 * @Modified:
 **/
public class UserService {
    @Resource
    UserMapper userMapper;

    public User findById(Long id){
        return userMapper.findById(id);
    }
}
