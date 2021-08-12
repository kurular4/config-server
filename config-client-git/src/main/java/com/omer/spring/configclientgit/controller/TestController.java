package com.omer.spring.configclientgit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value(value = "${testprop}")
    private String testprop;

    @GetMapping("/test")
    public String getTestProp() {
        return testprop;
    }
}
