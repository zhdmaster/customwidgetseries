package com.training.customviewseries;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.training.customviewseries.chapter1.Chapter1Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.activity_main_btn_chapter1).setOnClickListener(this);
        findViewById(R.id.activity_main_btn_chapter2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_btn_chapter1:
                startActivity(new Intent(this, Chapter1Activity.class));
                break;
            case R.id.activity_main_btn_chapter2:
                break;

            default:

        }
    }
}
