package com.example.duyng.qlsv;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "db_student";
    public static final String TABLE_NAME = "student";
    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "mail";
    public static final String KEY_AGE = "age";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_STUDENT = "CREATE TABLE " + TABLE_NAME + " ("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_NAME + " TEXT,"
                + KEY_EMAIL + " TEXT,"
                + KEY_AGE + " INTEGER)";
        db.execSQL(CREATE_TABLE_STUDENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}