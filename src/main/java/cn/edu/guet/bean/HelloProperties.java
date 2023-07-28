package com.example.service.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname HelloProperties
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/28 10:54
 * @Created by abner.guo
 */

@ConfigurationProperties(prefix = "hello")
@Component
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
