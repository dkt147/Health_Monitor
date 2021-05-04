package com.example.health_monitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre);



    }

    public void onClick1(View view) {
        Intent intent;
        intent = new Intent(PreActivity.this,Login.class);
        startActivity(intent);

    }

    public void onClick(View view) {
        Intent intent;
        intent = new Intent(PreActivity.this,MainActivity.class);
        startActivity(intent);
    }
}