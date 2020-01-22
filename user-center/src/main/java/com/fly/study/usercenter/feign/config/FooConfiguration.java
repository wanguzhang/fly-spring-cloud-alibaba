package com.fly.study.usercenter.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FooConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}