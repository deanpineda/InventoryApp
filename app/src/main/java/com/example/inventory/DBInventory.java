package com.example.inventory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBInventory extends SQLiteOpenHelper {

    public DBInventory( Context context) {
        super(context, "Productdata.db" , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB3) {
        DB3.execSQL("create Table Productdetails(prodid TEXT primary key, prodname TEXT, prodqty TEXT,prodprice TEXT, prodcateg TEXT, proddesc TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase DB3, int oldVersion, int newVersion) {
        DB3.execSQL("drop Table if exists Productdetails");

    }
    public Boolean insertproductdata(String prodid, String prodname, String prodqty, String prodprice, String prodcateg, String proddesc)
    {
        SQLiteDatabase DB3 = this.getWritableDatabase();
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("prodid", prodid);
        contentValues3.put("prodname", prodname);
        contentValues3.put("prodqty", prodqty);
        contentValues3.put("prodprice", prodprice);
        contentValues3.put("prodcateg", prodcateg);
        contentValues3.put("proddesc", proddesc);
        long result3= DB3.insert("Productdetails", null, contentValues3);
        if(result3==-1) {
            return false;
        }else{
            return true;
        }
    }
    public Boolean updateproductdata(String prodid, String prodname, String prodqty, String prodprice, String prodcateg, String proddesc)
    {
        SQLiteDatabase DB3 = this.getWritableDatabase();
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("prodname", prodname);
        contentValues3.put("prodqty", prodqty);
        contentValues3.put("prodprice", prodprice);
        contentValues3.put("prodcateg", prodcateg);
        contentValues3.put("proddesc", proddesc);
        Cursor cursor3 = DB3.rawQuery("Select * from Productdetails where prodid = ?", new String[] {prodid});
        if(cursor3.getCount()>0) {

            long result3 = DB3.update("Productdetails", contentValues3, "prodid=?", new String[] {prodid});
            if (result3 == -1) {
                return false;
            } else {
                return true;
            }
            }else{
                return false;
        }
    }
    public Boolean deleteproductdata(String prodid)
    {
        SQLiteDatabase DB3 = this.getWritableDatabase();
        Cursor cursor3 = DB3.rawQuery("Select * from Productdetails where prodid = ?", new String[] {prodid});
        if(cursor3.getCount()>0) {

            long result3 = DB3.delete("Productdetails", "prodid=?", new String[] {prodid});
            if (result3 == -1) {
                return false;
            } else {
                return true;
            }
            }else{
                return false;
        }
    }
    public Cursor getproductdata()
    {
        SQLiteDatabase DB3 = this.getWritableDatabase();
        Cursor cursor3 = DB3.rawQuery("Select * from Productdetails", null);
        return cursor3;

        }
    }

