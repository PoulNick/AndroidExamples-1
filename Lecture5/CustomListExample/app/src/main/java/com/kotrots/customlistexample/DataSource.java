package com.kotrots.customlistexample;

import java.util.ArrayList;

/**
 * Created by Kostas on 05/11/2015.
 */
public class DataSource {

    public ArrayList<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Kotrotsios Konstantinos", "kkotrotsios@gmail.com"));
        users.add(new User("Thanos Geogriadhs", "thanosgeorgiadis@hotmail.com"));
        users.add(new User("Stratis Batikas", "batikas.stratis@gmail.com"));
        users.add(new User("Nikolaos Dolopikos", "nikdol@gmail.com"));
        users.add(new User("Maria Lazou", "lazoum@gmail.com"));

        return users;
    }
}
