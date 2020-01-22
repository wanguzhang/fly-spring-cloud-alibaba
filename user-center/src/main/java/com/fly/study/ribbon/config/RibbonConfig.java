package com.fly.study.ribbon.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2020-01-21-23:48
 * @description
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule ribbonIRule(){
        return new NacosRule();
    }
}
