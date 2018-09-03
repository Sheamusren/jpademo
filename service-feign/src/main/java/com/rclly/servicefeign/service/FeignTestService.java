package com.rclly.servicefeign.service;

import com.rclly.servicefeign.config.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author sheamus
 */
@Service
@FeignClient(value = "jpademo",fallback = SchedualServiceHiHystric.class)
public interface FeignTestService {

    @GetMapping(value = "/user/listUser")
    String sayHiFromClientOne();

}
