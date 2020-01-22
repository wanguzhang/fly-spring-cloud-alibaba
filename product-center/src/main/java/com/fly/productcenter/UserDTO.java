package com.fly.productcenter;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-01-22-21:22
 * @description
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 2453920628922733442L;
    private String id;
    private String name;
}
