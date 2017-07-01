package com.gabor.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by Gabor on 2017/6/19.
 */
public class User {
    private int id;
    @NotNull(message = "登录名不为空")
    private String name;
    @Length(min = 6,max = 14,message = "密码长度必须在6至14位之间")
    private String password;
    @Email(message = "必须是合法的邮箱地址")
    private String email;
    @Pattern(regexp = "[1][0-9]{10}",message = "无效的电话号码")
    private String phoneNum;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
