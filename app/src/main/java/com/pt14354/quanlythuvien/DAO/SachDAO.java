package com.pt14354.quanlythuvien.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.pt14354.quanlythuvien.Database.DatabaseHelper;
import com.pt14354.quanlythuvien.Model.Sach;

public class SachDAO {
    private static SQLiteDatabase db;
    private DatabaseHelper dbHelper;
    private boolean checkPrimaryKey;

    public static final String TABLE_NAME = "Sach";
    public static final String SQL_SACH = "CREATE TABLE Sach ( idSach text primary key, tenSach String," +
            "loaiSach String, soLuong number);";
    public static final String TAG = "SachDAO";


    public SachDAO(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }
    public static int insertSach(Sach s) {
        ContentValues values = new ContentValues();
        values.put("tenSach", s.getTenSach());
        values.put("loaiSach", s.getLoaiSach());
        values.put("soLuong", s.getSoLuong());
        if (checkPrimaryKey(s.getIdSach())) {
            int result = db.update(TABLE_NAME, values, "idSach=?", new String[]{s.getIdSach()});
            if (result == 0) {
                return -1;
            }
        } else {
            try {
                if (db.insert(TABLE_NAME, null, values) == -1) {
                    return -1;
                }
            } catch (Exception ex) {
                Log.e(TAG, ex.toString());
            }
        }
        return 1;
    }

    private static boolean checkPrimaryKey(String strPrimaryKey) {
        //Select
        String[] columns = {"idSach"};
        //Where
        String selection = "idSach=?";
        //where clauser agruments

        String[] selectionArgs ={strPrimaryKey};
        Cursor c = null;
        try{
            c = db.query(TABLE_NAME,columns,selection,selectionArgs,null, null, null);
            c.moveToFirst();
            int i = c.getCount();
            c.close();
            if (i<=0){
                return false;
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}



