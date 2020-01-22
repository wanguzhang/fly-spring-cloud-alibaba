package com.fly.study.usercenter.feign.config;

import com.fly.study.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Map;

/**
 * @author 张攀钦
 * @date 2020-01-22-20:30
 * @description
 */
@FeignClient(name = "product-center",configuration = {FooConfiguration.class})
public interface ProductCenterFeignConfig {
    @GetMapping(value = "/products/{id}")
    Map getProduct(@PathVariable String id);

    @GetMapping(value = "/products")
//    Map insertProduct(@RequestParam String id ,@RequestParam String name);
    Map insertProduct(@SpringQueryMap UserDTO userDTO);
}
