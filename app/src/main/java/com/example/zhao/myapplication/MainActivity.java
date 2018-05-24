package com.example.zhao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        test1();
        second();
        String hh = "哈哈";
    }

    private void second() {
        Toast.makeText(this,"mysecond",Toast.LENGTH_SHORT).show();
    }

    private void test1() {
        Toast.makeText(this,"hello—world",Toast.LENGTH_SHORT).show();
    }

}
