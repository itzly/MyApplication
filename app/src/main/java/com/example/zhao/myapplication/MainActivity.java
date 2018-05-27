package com.example.zhao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_main_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main_text = (TextView) findViewById(R.id.tv_main_text);
//        test1();
        second();
        String hh = "哈哈";

        feature1();
    }

    private void feature3() {
        tv_main_text.setText("feature3");
    }

    private void feature2() {
        tv_main_text.setText("feature-2功能");
    }

    private void feature1() {
        tv_main_text.setText("feature-1功能");
    }

    private void second() {
        Toast.makeText(this,"mysecond",Toast.LENGTH_SHORT).show();
    }

    private void test1() {
        Toast.makeText(this,"hello—world",Toast.LENGTH_SHORT).show();
    }

}
