package com.example.health_monitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onClick(View view)
    {
        Intent intent;
        intent = new Intent(Login.this,tabActivity.class);
        startActivity(intent);
    }
    public void onClick1(View view)
    {
        Intent intent;
        intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }
}