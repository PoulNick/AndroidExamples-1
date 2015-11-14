package com.kotrots.customlistexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listView);

        dataSource = new DataSource(MainActivity.this);
        try {
            dataSource.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        dataSource.inserUsers("Thanos Geogriadhs", "thanosgeorgiadis@hotmail.com");

        ArrayList<User> users = dataSource.getAllUsers();

        UserAdapter adapter = new UserAdapter(MainActivity.this, users);
        list.setAdapter(adapter);
    }
}
