package com.example.uts_riza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_nomor;
    Button btn_daftar;
    CheckBox cbKonfir;
    Spinner spJalur;

    String Namalengkap, Nomorpendaftaran, Jalurpendaftaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        btn_daftar = findViewById(R.id.btn_daftar);
        cbKonfir = findViewById(R.id.cbKonfir);
        spJalur = findViewById(R.id.spJalur);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Namalengkap = et_nama.getText().toString();
                Nomorpendaftaran = et_nomor.getText().toString();
                Jalurpendaftaran = spJalur.getSelectedItem().toString();


                if (Namalengkap.trim().equals("")){
                    et_nama.setError("Nama Tidak Boleh Kosong");
                }
                else if (Nomorpendaftaran.trim().equals("")){
                    et_nomor.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VarNamaPendaftaran", String.valueOf(Namalengkap));
                    intent.putExtra("VarNomorPendaftaran", String.valueOf(Nomorpendaftaran));
                    intent.putExtra("VarJalurPendaftaran", String.valueOf(Jalurpendaftaran));
                    startActivity(intent);
                }
            }
        });


        cbKonfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbKonfir.isChecked()) {
                    Toast.makeText(MainActivity.this, "Terkonfirmasi", Toast.LENGTH_SHORT).show();
                } else if (!cbKonfir.isChecked()){
                    Toast.makeText(MainActivity.this, "Silahkan centang", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}