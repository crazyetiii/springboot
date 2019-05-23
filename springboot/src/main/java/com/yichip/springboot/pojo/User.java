package com.yichip.springboot.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userid;

    private String username;

    private String password;

    private String phone;

    private static final long serialVersionUID = 1L;

    public User(Integer userid, String username, String password, String phone) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}