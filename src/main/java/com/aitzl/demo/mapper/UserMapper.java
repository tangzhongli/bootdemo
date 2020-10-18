package com.aitzl.demo.mapper;

import com.aitzl.demo.entity.User;

/**
 * @Description: TODO
 * @Author: Zhongli·Tang
 * @Date: 2020-10-18 11:43
 * @Version: v1.0.0
 * @Modified:
 **/
public interface UserMapper {
    User findById(Long id);
}
