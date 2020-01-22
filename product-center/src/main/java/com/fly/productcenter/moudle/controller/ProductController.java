package com.fly.productcenter.moudle.controller;

import com.fly.productcenter.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2020-01-21-23:01
 * @description
 */
@RestController
@Slf4j
public class ProductController {
    @Autowired
    private Environment environment;
    @GetMapping(value = "/products/{id}")
    public Map getProductById(@PathVariable String id){
        log.info("product-center 执行力");
        Map ret = new HashMap<>(16);
        String port = environment.getProperty("server.port");
        String applicationName = environment.getProperty("spring.application.name");
        String clusterName = environment.getProperty("spring.cloud.nacos.discovery.cluster-name");
        ret.put("port",port);
        ret.put("clusterName",clusterName);
        ret.put("applicationName",applicationName);
        ret.put("id",id);
        return ret;
    }

    @GetMapping(value = "/products")
    public Map insertProduct(UserDTO userDTO){
        Map map = new HashMap<>();
        map.put("id",userDTO.getId());
        map.put("name",userDTO.getName());
        return map;
    }
}
