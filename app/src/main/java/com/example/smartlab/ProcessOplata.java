package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class ProcessOplata extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_oplata);

        TextView mTimer = (TextView) findViewById(R.id.textView2);

        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTimer.setText("Взламываем банк!");
            }

            public void onFinish() {
                Intent intent = new Intent(ProcessOplata.this, OplataKonec.class);
                startActivity(intent);;
            }
        }
                .start();
    }
}