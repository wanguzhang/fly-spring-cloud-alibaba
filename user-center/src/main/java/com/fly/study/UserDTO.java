package com.fly.study;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 2453920628922733442L;
    private String id;
    private String name;
}