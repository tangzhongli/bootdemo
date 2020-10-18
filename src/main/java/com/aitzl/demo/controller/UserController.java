package com.aitzl.demo.controller;

import com.aitzl.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: Zhongli·Tang
 * @Date: 2020-10-18 11:45
 * @Version: v1.0.0
 * @Modified:
 **/
@RestController
@RequestMapping("/boot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public String GetUser(@PathVariable Long id){
        return userService.findById(id).toString();
    }

    @RequestMapping("/find")
    public String findUser(){
        Long id=1000l;
        return userService.findById(id).toString();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
