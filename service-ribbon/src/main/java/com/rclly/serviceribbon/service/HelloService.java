package com.rclly.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author sheamus
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public List hiService() {
        return restTemplate.getForObject("http://jpademo/user/listUser", List.class);
    }
}
