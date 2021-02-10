package com.example.deleventticketing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Detail11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail11);
    }
    public void pesan1(View view){
        Intent intent = new Intent(getApplicationContext(),Pesan.class);
        startActivity(intent);
    }
}
