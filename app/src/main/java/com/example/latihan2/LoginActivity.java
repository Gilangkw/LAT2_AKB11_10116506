package com.example.latihan2;
//Nama : Gilang Kusuma Wijaya
//Kelas: AKB-11/IF-11
//NIM  : 10116506
//Tanggal 18/04/2019
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void regis(View view) {
        Intent intent = new Intent(this, RegisterAcitivity.class);
        startActivity(intent);
    }
}
