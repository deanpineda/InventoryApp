package com.example.inventory;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBSupplier extends SQLiteOpenHelper {
    public DBSupplier(Context context) {
        super(context, "Userdata2.DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB2) {
        DB2.execSQL("create Table Userdetails(name TEXT primary key, contact TEXT, email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB2, int i, int i1) {
        DB2.execSQL("drop Table if exists Userdetails");


    }
    public Boolean insertuserdata(String name, String contact, String email) {
        SQLiteDatabase DB2 = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("contact", contact);
        contentValues.put("email", email);
        long result = DB2.insert("Userdetails", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }

    }
    public Boolean updateuserdata(String name, String contact, String email) {
        SQLiteDatabase DB2 = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact", contact);
        contentValues.put("email", email);
        Cursor cursor = DB2.rawQuery("Select * from Userdetails where name=?", new String[]{name});
        if (cursor.getCount() > 0) {

            long result = DB2.update("Userdetails", contentValues, "name=?", new String[]{name});
            if (result == -1) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }
    public Boolean deletedata(String name) {
        SQLiteDatabase DB2 = this.getWritableDatabase();
        Cursor cursor = DB2.rawQuery("Select * from Userdetails where name=?", new String[]{name});
        if (cursor.getCount() > 0) {

            long result = DB2.delete("Userdetails", "name=?", new String[]{name});
            if (result == -1) {
                return false;
            } else {
                return true;
            }

        }else
        {
            return false;
        }
    }
    public Cursor getdata() {
        SQLiteDatabase DB2 = this.getWritableDatabase();
        Cursor cursor = DB2.rawQuery("Select * from Userdetails", null);
        return cursor;
    }
}


