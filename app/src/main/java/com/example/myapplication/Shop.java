package com.example.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shop extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shop);
         Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
         Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
         Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:

                break;
            default:
                break;
        }

    }
}
