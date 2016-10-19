package com.iluwatar.converter;

import static com.sun.jmx.snmp.EnumRowStatus.active;

/**
 * Created by karma on 10/18/2016.
 */
public class AccountDto extends D {
    private String userId;
    private String active;
    private String Password;
    private String accountType;
    private String email;
    private String password;

    public AccountDto() {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }



}
