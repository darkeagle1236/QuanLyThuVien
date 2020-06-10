package com.pt14354.quanlythuvien.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.pt14354.quanlythuvien.DAO.MuonDAO;
import com.pt14354.quanlythuvien.DAO.NguoiDungDAO;
import com.pt14354.quanlythuvien.DAO.SachDAO;

public class   DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "QLTV";
    public static final int VERSION = 1;
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME,null , VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NguoiDungDAO.SQL_NGUOI_DUNG);
        db.execSQL(SachDAO.SQL_SACH);
        db.execSQL(MuonDAO.SQL_MUON);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ NguoiDungDAO.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ SachDAO.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ MuonDAO.TABLE_NAME);

        onCreate(db);
    }
}
