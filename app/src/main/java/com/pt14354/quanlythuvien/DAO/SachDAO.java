package com.pt14354.quanlythuvien.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.pt14354.quanlythuvien.Database.DatabaseHelper;

public class SachDAO {
    private static SQLiteDatabase db;
    private DatabaseHelper dbHelper;
    private boolean checkPrimaryKey;

    public static final String TABLE_NAME = "Sach";
    public static final String SQL_SACH = "CREATE TABLE Sach ( idSach text primary key, tensach String," +
            "loaiSach String, soLuong number);";
    public static final String TAG = "SachDAO";


    public SachDAO(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }
}



