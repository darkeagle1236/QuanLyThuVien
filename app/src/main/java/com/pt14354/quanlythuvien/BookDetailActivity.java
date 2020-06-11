package com.pt14354.quanlythuvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pt14354.quanlythuvien.DAO.SachDAO;

public class BookDetailActivity extends AppCompatActivity {
    TextView tvTenSach,tvLoaiSach,tvSoLuong;
    Button btnUpdate,btnBorrow;
    SachDAO sachDAO;
    String tensach,loaisach,soluong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        tvTenSach=findViewById(R.id.tvTenSach);
        tvLoaiSach=findViewById(R.id.tvLoaiSach);
        tvSoLuong=findViewById(R.id.tvSoLuong);
        btnUpdate=findViewById(R.id.btnUpdate);
        btnBorrow=findViewById(R.id.btnBorrow);
        sachDAO= new SachDAO(this);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        tensach=b.getString("NAME");
        loaisach=b.getString("KIND");
        soluong= b.getString("AMOUNT");
        tvTenSach.setText("Tên Sách: "+tensach);
        tvLoaiSach.setText("Loại sách: "+ loaisach);
        tvSoLuong.setText("Số lượng" + soluong);
    }
    public void Borrow(View view) {
    }
    public void Update(View view) {
    }
}