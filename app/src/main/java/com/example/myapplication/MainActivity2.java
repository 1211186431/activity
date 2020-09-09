package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        Button button=(Button)findViewById(R.id.button2);
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age",10);
        Toast.makeText(this,name+" "+age,Toast.LENGTH_LONG).show();
    }
}