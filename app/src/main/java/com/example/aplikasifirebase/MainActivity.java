package com.example.aplikasifirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnTambah = findViewById(R.id.add_mhs);
        CardView btnList = findViewById(R.id.list_mhs);

        btnTambah.setOnClickListener(this);

        btnList.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add_mhs:
                Intent tambah = new Intent(MainActivity.this, TambahMhsActivity.class);
                startActivity(tambah);
                break;
            case R.id.list_mhs:
                Intent list = new Intent(MainActivity.this, ListMhsActivity.class);
                startActivity(list);
                break;
        }
    }


}