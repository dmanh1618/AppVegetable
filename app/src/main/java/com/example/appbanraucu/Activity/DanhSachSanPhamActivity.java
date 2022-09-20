package com.example.appbanraucu.Activity;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appbanraucu.Adapters.SanPhamAdapter;
import com.example.appbanraucu.R;
import com.example.appbanraucu.Utils.Common;

public class DanhSachSanPhamActivity extends AppCompatActivity {

    SanPhamAdapter adapter;
    GridView lv_sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_san_pham);
        lv_sp = findViewById(R.id.lv_sanpham);
        adapter = new SanPhamAdapter(getApplicationContext(), Common.sanPhamList);
        lv_sp.setAdapter(adapter);
    }
}