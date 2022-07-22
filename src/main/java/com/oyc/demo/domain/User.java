package com.oyc.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Author ms
 * @Date 2022/07/22
 */
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String account;
    private String password;
}
