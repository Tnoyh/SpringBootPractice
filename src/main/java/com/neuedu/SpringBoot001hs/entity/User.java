package com.neuedu.SpringBoot001hs.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String user;
    private String password;
    private String email;
    private String phone;
    private String name;
    private Date createtime;
    private String headurl;
    private Integer status;
}
