package com.taotao.service.impl;

import com.taotao.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements TestService {
    public void sayHi() {
        System.out.println("TestServiceImpl的sayHi方法被调用！");
    }
}
