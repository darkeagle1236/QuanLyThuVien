package com.pt14354.quanlythuvien.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.pt14354.quanlythuvien.Database.DatabaseHelper;
import java.text.SimpleDateFormat;
public class MuonDAO {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final String TABLE_NAME="Muon";
    public static final String SQL_MUON ="CREATE TABLE Muon ( idMuon PRIMARY KEY, " +
            "user text ,ngayMuon date, ngayTra text,maSach text , soLuong INTEGER, trangThai boolean);";
    public static final String TAG = "MuonDAO";
    public MuonDAO(Context context){
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }
}


