package com.pt14354.quanlythuvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pt14354.quanlythuvien.DAO.NguoiDungDAO;
import com.pt14354.quanlythuvien.DAO.SachDAO;
import com.pt14354.quanlythuvien.Model.NguoiDung;
import com.pt14354.quanlythuvien.Model.Sach;

public class AddBookActivity extends AppCompatActivity {

    private Button button;
    EditText edtNameBook, edtTypeBook,edtAmount;
    Button btnAddBook;
    SachDAO sachDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
        edtNameBook = findViewById(R.id.edtNameBook);
        edtTypeBook = findViewById(R.id.edtTypeBook);
        edtAmount = findViewById(R.id.edtAmount);
        btnAddBook = findViewById(R.id.btnAddBook);
        button = (Button) findViewById(R.id.btnAddBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void addBook(View view) {
        sachDAO = new SachDAO(AddBookActivity.this);
        Sach sach = new Sach(edtNameBook.getText().toString(),
                edtTypeBook.getText().toString(),
                edtAmount.getText().toString());
        try{
            if (validateForm()>0){
                if(SachDAO.insertSach(sach) > 0){
                    Toast.makeText(getApplicationContext(), "Thêm Thành Công",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Thêm Thất Bại",Toast.LENGTH_LONG).show();
                }
            }
        }catch (Exception ex){
            Log.d("Error",ex.toString());
        }

    }
    private int validateForm() {
        int check = 1;
        if (edtNameBook.getText().length() == 0 ||
        edtTypeBook.getText().length() == 0 ||
        edtAmount.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Bạn phải nhập đầy đủ thông tin", Toast.LENGTH_LONG).show();
            check = -1;
        }
        return check;
    }

}