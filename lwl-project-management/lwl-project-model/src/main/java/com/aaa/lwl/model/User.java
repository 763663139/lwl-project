package com.aaa.lwl.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wyh
 * date 2020-07-08
 */
@Data
public class User implements Serializable {
    private String id;
    private String username;
    private String password;

}
