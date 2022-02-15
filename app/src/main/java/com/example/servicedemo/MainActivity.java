package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSomething(View view) {
        Intent i1 = new Intent(this, MyService.class);
        startService(i1);
    }

    public void stopSomething(View view) {
        Intent i1 = new Intent(this, MyService.class);
        stopService(i1);
    }
}