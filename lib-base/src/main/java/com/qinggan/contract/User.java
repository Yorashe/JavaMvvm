package com.qinggan.contract;

/**
 * 登录完成后，组件间通信的契约类
 */
public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
