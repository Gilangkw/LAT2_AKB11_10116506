package com.example.latihan2;
//Nama : Gilang Kusuma Wijaya
//Kelas: AKB-11/IF-11
//NIM  : 10116506
//Tanggal 18/04/2019
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_acitivity);
    }

    public void daftar(View view) {
        Intent regis  = new Intent(getApplicationContext(),AlmostThere.class);
        startActivity(regis);
    }
}
