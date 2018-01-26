package com.example.muhammad_hamza.memosaver;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Muhammad_Hamza on 26-Jan-18.
 */

public class MemoDATABASE extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "UserMemo.db";
    public static final String TABLE_NAME = "Memo_table.db";
    public static final String COL_ID = "ID";
    public static final String COL_NAME = "NAME";
    public static final String COL_PSWD = "PASSWORD";
    public static final String COL_MEMO1 = "MEMO1";


    public MemoDATABASE(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT , PASSWORD PASSWORD, MEMO1 TEXT, MEMO2 TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addMemo(String name, String pswd, String memo1){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_NAME, name);
        cv.put(COL_PSWD, pswd);
        cv.put(COL_MEMO1, memo1);

        long insertion = db.insert(TABLE_NAME, null, cv);

        if(insertion == -1){

            return true;
        }
        else {
            return false;
        }

    }
}