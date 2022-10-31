package com.example.uts_riza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String Namalengkap, Nomorpendaftaran, Jalurpendaftaran;

    TextView tv_Nama, tv_Nomor, tv_Jalur;
    Spinner spJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tv_Nama = findViewById(R.id.tv_Nama );
        tv_Nomor = findViewById(R.id.tv_Nomor);
        tv_Jalur = findViewById(R.id.tv_Jalur);

        Intent intent = getIntent();

        tv_Nama.setText(intent.getStringExtra("VarNamaPendaftaran"));
        tv_Nomor.setText(intent.getStringExtra("VarNomorPendaftaran"));
        tv_Jalur.setText(intent.getStringExtra("VarJalurPendaftaran"));


    }
}