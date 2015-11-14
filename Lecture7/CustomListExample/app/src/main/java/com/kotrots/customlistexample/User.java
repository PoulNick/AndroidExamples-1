package com.kotrots.customlistexample;

/**
 * Created by Kostas on 05/11/2015.
 */
public class User {

    User(String name, String email){
        this.name = name;
        this.email = email;
    }

    User(){

    }

    private String name;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
