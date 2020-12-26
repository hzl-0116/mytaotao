package com.taotao.controller;

import com.taotao.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference
    private TestService testService;
    @RequestMapping("/sayHi")
    public String sayHi(){
        testService.sayHi();
        return "success!!!!";

    }
}
