package com.rclly.jpademo.controller;

import com.rclly.jpademo.entiry.UserEntity;
import com.rclly.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sheamus
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("listUser")
    public List<UserEntity> listUser(){
        return userService.listUser();
    }
}
