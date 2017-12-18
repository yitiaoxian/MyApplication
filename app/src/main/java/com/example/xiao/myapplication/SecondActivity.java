package com.example.xiao.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiao on 2017/12/18.
 */

public class SecondActivity extends Activity {
    Button bt1;
    View v1;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        v1=getLayoutInflater().inflate(R.layout.activity_second,null);

    }
}
