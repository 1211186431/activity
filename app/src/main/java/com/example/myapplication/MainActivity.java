package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=
                new Intent(MainActivity.this,MainActivity2.class);
                EditText editText=findViewById(R.id.textView1);
                String name=editText.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("age",20);
                startActivityForResult(intent,0);
            }
        });

        Button button2=(Button)findViewById(R.id.b2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=
                        new Intent(MainActivity.this,MainActivity3.class);
                EditText editText=findViewById(R.id.textView1);
                String name=editText.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("age",20);
                startActivityForResult(intent,0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
        if(requestCode==0 && resultCode==1){
            String str=data.getStringExtra("result2");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
    }

}