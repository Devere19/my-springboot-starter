package com.example.service.auto;

import com.example.service.HelloService;
import com.example.service.bean.HelloProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname HellosServiceAutoConfiguration
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/28 10:56
 * @Created by abner.guo
 */
@Configuration
public class HellosServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
