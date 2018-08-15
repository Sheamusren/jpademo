package com.rclly.jpademo.service.impl;

import com.rclly.jpademo.dao.UserDao;
import com.rclly.jpademo.entiry.UserEntity;
import com.rclly.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sheamus
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao uDao;
    @Override
    public List<UserEntity> listUser() {
        return uDao.findAll();
    }
}
