package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SubjectPage extends AppCompatActivity {
    Button wt,ant,mpmc,cn,hwm,se;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_subject_page1);

        wt = (Button) findViewById(R.id.button5);
        ant = (Button) findViewById(R.id.button6);
        mpmc = (Button) findViewById(R.id.button9);
        cn = (Button) findViewById(R.id.button7);
        hwm = (Button) findViewById(R.id.button10);
        se = (Button) findViewById(R.id.button8);

        wt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectPage.this,WT.class);
                startActivity(intent);

            }
        });
        ant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectPage.this,ANT.class);
                startActivity(intent);
            }
        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectPage.this,CN.class);
                startActivity(intent);
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectPage.this,SE.class);
                startActivity(intent);
            }
        });
        mpmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectPage.this,MPMC.class);
                startActivity(intent);
            }
        });

        hwm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectPage.this,HWM.class);
                startActivity(intent);
            }
        });

    }
}