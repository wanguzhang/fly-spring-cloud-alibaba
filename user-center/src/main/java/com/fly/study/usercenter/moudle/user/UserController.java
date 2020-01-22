package com.fly.study.usercenter.moudle.user;

import com.fly.study.UserDTO;
import com.fly.study.usercenter.feign.config.ProductCenterFeignConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2020-01-21-23:10
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private Environment environment;

    @Autowired
    private ProductCenterFeignConfig productCenterFeignConfig;

    @GetMapping(value = "/users/{id}")
    public Map getUserById(@PathVariable String id){
        Map ret = new HashMap<>(16);
        String port = environment.getProperty("server.port");
        String applicationName = environment.getProperty("spring.application.name");
        String clusterName = environment.getProperty("spring.cloud.nacos.discovery.cluster-name");
        ret.put("port",port);
        ret.put("clusterName",clusterName);
        ret.put("applicationName",applicationName);
        ret.put("id",id);
        Map product = productCenterFeignConfig.getProduct("111");
        ret.put("product",product);
        return ret;
    }

    @GetMapping(value = "/feign-test")
    public Map feignTest(){
        Map map = new HashMap<>();
        map.put("id","测试id");
        map.put("name","测试名称");
        UserDTO userDTO=new UserDTO();
        userDTO.setId("测试 ID");
        userDTO.setName("测试 name");
        return productCenterFeignConfig.insertProduct(userDTO);
    }
}
