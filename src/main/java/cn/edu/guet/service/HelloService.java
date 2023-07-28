package com.example.service;

import com.example.service.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname HelloService
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/28 10:53
 * @Created by abner.guo
 */


public class HelloService {


    @Autowired
    private HelloProperties helloProperties;

    public String sayHello(String name){
        return helloProperties.getPrefix()+"," + helloProperties.getSuffix();
    }
}
