package com.rclly.jpademo.service;

import com.rclly.jpademo.entiry.UserEntity;

import java.util.List;

/**
 * @author sheamus
 */

public interface UserService {
    /**
     * 获取用户信息列表
     * @return
     */
    List<UserEntity> listUser();
}
