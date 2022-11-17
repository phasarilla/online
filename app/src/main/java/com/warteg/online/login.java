package com.warteg.online;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ic_back2(View view) {
        Intent  intent = new Intent(login.this,MainActivity.class);
        startActivity(intent);
    }

    public void L_txt_reg(View view) {
        Intent intent = new Intent(login.this,RegisterActivity.class);
        startActivity(intent);
    }
}