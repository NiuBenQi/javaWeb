package com.lemon.pojo;

/**
 * @author benqi
 * @date 2020/1/15 22:37
 * @Description
 */

public class User {
    private int id;
    private String username;
    private String userpwd;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int id, String username, String userpwd, String email) {
        this.id = id;
        this.username = username;
        this.userpwd = userpwd;
        this.email = email;
    }
}
