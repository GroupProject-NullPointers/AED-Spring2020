/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public abstract class User {

  
    private String password;
    private String userName;
    private String role;

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        User.date = date;
    }
    public static Date date;

    public User(String password, String userName, String role) {
        this.password = password;
        this.userName = userName;
        this.role = role;
        long showTime= System.currentTimeMillis();
        Date StringDate = new java.util.Date(showTime);
        User.setDate(StringDate);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    abstract public boolean verify(String password);

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return getUserName();
    }
    
}
