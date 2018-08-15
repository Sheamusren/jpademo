package com.rclly.jpademo.dao;

import com.rclly.jpademo.entiry.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author sheamus
 */
@Repository
public interface UserDao extends JpaRepository<UserEntity, Long> {

}
