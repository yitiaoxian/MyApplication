package com.example.xiao.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick_but1(View view){
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        Toast.makeText(this,"你点击了按钮",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
