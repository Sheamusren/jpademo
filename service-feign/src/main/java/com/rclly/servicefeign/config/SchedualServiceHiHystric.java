package com.rclly.servicefeign.config;

import com.rclly.servicefeign.service.FeignTestService;
import org.springframework.stereotype.Component;

/**
 * @Author sheamus
 */
@Component
public class SchedualServiceHiHystric implements FeignTestService {

    @Override
    public String sayHiFromClientOne() {
        return "sorry ";
    }
}
