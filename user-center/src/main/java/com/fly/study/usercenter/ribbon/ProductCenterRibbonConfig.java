package com.fly.study.usercenter.ribbon;

import com.fly.study.ribbon.config.RibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 张攀钦
 * @date 2020-01-22-00:11
 * @description
 */
@RibbonClient(name = "product-center",configuration = {RibbonConfig.class})
public class ProductCenterRibbonConfig {
}
