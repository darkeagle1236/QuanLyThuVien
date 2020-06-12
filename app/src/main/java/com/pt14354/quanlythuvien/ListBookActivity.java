package com.pt14354.quanlythuvien;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pt14354.quanlythuvien.DAO.SachDAO;
import com.pt14354.quanlythuvien.Model.Sach;

import java.util.ArrayList;
import java.util.List;
public class ListBookActivity extends AppCompatActivity {
    public  static List<Sach> dsbook = new ArrayList<>();
    ListView lvbook;
    Sach adapter = null;
    SachDAO sachDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Book");
        setContentView(R.layout.activity_list_book);
        lvbook = findViewById(R.id.lvbook);
        sachDAO = new SachDAO(ListBookActivity.this);
//        dsbook = sachDAO.getAllNguoiDung();
//        adapter = new NguoidungAdapter(this,dsbook);
//        lvbook.setAdapter(adapter);
        lvbook.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListBookActivity.this,BookDetailActivity.class);
                Bundle b = new Bundle();
                b.putString("NAME", dsbook.get(i).getTenSach());
                b.putString("KIND", dsbook.get(i).getLoaiSach());
                b.putInt("AMOUNT", dsbook.get(i).getSoLuong());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        lvbook.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return false;
            }
        });
    }
}
