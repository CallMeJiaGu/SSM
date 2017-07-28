package cn.gradle.demo.modle;

import java.io.Serializable;

/**
 * Created by dell on 2017/7/28.
 */
public class User implements Serializable{
    private static final long serialVersionUID = -4343345975911040185L;

    private String userName;
    private String userPassword;
    private Integer userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
