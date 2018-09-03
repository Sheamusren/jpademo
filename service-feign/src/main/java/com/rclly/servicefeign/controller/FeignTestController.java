package com.rclly.servicefeign.controller;

import com.rclly.servicefeign.service.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sheamus
 */
@RestController
public class FeignTestController {

    @Autowired
    FeignTestService feignTestService;

    @GetMapping(value = "/hi")
    public String sayHi() {
        return feignTestService.sayHiFromClientOne();
    }
}
