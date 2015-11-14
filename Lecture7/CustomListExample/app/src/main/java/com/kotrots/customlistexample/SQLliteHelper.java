package com.kotrots.customlistexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kostas on 12/11/2015.
 */
public class SQLliteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "users_db.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_USERS = "users";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EMAIL = "email";

    private static final String DATABASE_CREATE_USERS = "create table "
            + TABLE_USERS + "(" + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_NAME  + " text not null,"
            + COLUMN_EMAIL + " text not null);";


    public SQLliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_USERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }
}
