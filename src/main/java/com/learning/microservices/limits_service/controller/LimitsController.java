package com.learning.microservices.limits_service.controller;

import com.learning.microservices.limits_service.bean.Limits;
import com.learning.microservices.limits_service.configuration.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration limitsConfiguration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
    }

}
