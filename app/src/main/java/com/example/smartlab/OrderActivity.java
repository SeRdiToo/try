package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void back (View view)
    {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
    public void oplatakon (View view)
    {
        Intent intent = new Intent(this, ProcessOplata.class);
        startActivity(intent);
    }
}