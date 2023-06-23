package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OplataKonec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oplata_konec);
    }

    public void naglav (View view)
    {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}