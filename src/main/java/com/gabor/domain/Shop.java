package com.gabor.domain;

import java.util.List;

/**
 * Created by Gabor on 2017/6/19.
 */
public class Shop {
    private int id;
    private String name;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return userName;
    }

    public void setUser(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
