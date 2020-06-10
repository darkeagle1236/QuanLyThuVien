package com.pt14354.quanlythuvien.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.pt14354.quanlythuvien.Database.DatabaseHelper;
import java.text.SimpleDateFormat;
public class MuonDAO {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final String TABLE_NAME="Muon";
    public static final String SQL_MUON ="CREATE TABLE HoaDonChiTiet ( idMuon PRIMARY KEY, " +
            "user text NOT NULL,ngayMuon date, ngayTra text,maSach text NOT NULL, soLuong INTEGER, trangThai boolean);";
    public static final String TAG = "HoaDonChiTietDAO";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public MuonDAO(Context context){
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }
}


