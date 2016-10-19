package com.iluwatar.converter;

/**
 * Created by karma on 10/18/2016.
 */
public class Account extends E {
    private String userId;
    private String active;
    private String Password;
    private String accountType;

    public Account() {
        super();
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(Object o) {
    }
    public Object getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return Password;
    }



}
