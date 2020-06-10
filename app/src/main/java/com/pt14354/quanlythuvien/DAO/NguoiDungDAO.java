package com.pt14354.quanlythuvien.DAO;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.pt14354.quanlythuvien.Database.DatabaseHelper;

public class NguoiDungDAO {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final  String TABLE_NAME = "NguoiDung";
    public static final String SQL_NGUOI_DUNG = "CREATE TABLE NguoiDung(idUser text primary key ,username text , " +
            "password text);";
    public static final String TAG = "NguoiDungDAO";
    public NguoiDungDAO(Context context){
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }
}
