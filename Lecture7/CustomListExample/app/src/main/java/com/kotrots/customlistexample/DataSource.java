package com.kotrots.customlistexample;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Kostas on 05/11/2015.
 */
public class DataSource {

    private SQLiteDatabase database;
    private SQLliteHelper dbHelper;
    private String[] allColumns = { SQLliteHelper.COLUMN_ID,
            SQLliteHelper.COLUMN_NAME, SQLliteHelper.COLUMN_EMAIL };

    public DataSource(Context context){
        dbHelper = new SQLliteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void inserUsers(String name, String email){
        database.execSQL("INSERT INTO 'users' (name, email) VALUES ('"+name+"', '"+email+"')");
    }

    public ArrayList<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<>();

        Cursor cursor = database.query(SQLliteHelper.TABLE_USERS, allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            User user = cursorToUser(cursor);
            users.add(user);
            cursor.moveToNext();
        }
        cursor.close();
        return users;
    }

    private User cursorToUser(Cursor cursor) {
        User user = new User();
        user.setName(cursor.getString(1));
        user.setEmail(cursor.getString(2));
        return user;
    }
}


/*
users.add(new User("Kotrotsios Konstantinos", "kkotrotsios@gmail.com"));
users.add(new User("Thanos Geogriadhs", "thanosgeorgiadis@hotmail.com"));
users.add(new User("Stratis Batikas", "batikas.stratis@gmail.com"));
users.add(new User("Nikolaos Dolopikos", "nikdol@gmail.com"));
users.add(new User("Maria Lazou", "lazoum@gmail.com"));
*/
