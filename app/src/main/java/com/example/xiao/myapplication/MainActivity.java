package com.example.xiao.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements DialogInterface.OnClickListener {
    //定义显示接收Activity传入值的TextView
    private TextView tv_main_result = null;
    //定义跳转的Button按钮
    private Button btn_main_skip = null;
    private Button button1to3=null;
    //定义一个startActivityForResult（）方法用到的整型值
    private final int requestCode = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        tv_main_result = (TextView)findViewById(R.id.tv_main_result);
        btn_main_skip = (Button)findViewById(R.id.btn_main_skip);
        btn_main_skip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //采用Intent普通传值的方式
                intent.putExtra("skip", "我是MainActivity传过来的值！");
                //跳转Activity
                startActivityForResult(intent, requestCode);

            }
        });
        button1to3=(Button)findViewById(R.id.button1to3);
        button1to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                intent.putExtra("skip","我是第一个activity传到第三个activity的");
                startActivityForResult(intent,requestCode);
            }
        });
    }


    /**
     * 接收当前Activity跳转后，目标Activity关闭后的回传值
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(resultCode){
            case RESULT_OK:{//接收并显示Activity传过来的值
                Bundle bundle = data.getExtras();
                String rs = bundle.getString("rs");
                tv_main_result.setText(rs);
                break;
            }

            default:
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
