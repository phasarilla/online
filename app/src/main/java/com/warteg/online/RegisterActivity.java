package com.warteg.online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void bt_3(View view) {
        Intent intent = new Intent(RegisterActivity.this,login.class);
        startActivity(intent);
    }

    public void r_log(View view) {
        Intent intent = new Intent(RegisterActivity.this,login.class);
        startActivity(intent);
    }

    public void ic_back1(View view) {
        Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
        startActivity(intent);
    }
}