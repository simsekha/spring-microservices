package com.simsekonline.microservices.limitsservice;

import com.simsekonline.microservices.limitsservice.bean.LimitConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration Configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(Configuration.getMaximum(), Configuration.getMinimum());
    }

}