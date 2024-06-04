package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SubjectPage2 extends AppCompatActivity {
    Button ci,cg,mc,ooad,st,bda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_subject_page2);

        ci = (Button) findViewById(R.id.button5);
        cg = (Button) findViewById(R.id.button6);
        mc = (Button) findViewById(R.id.button9);
        ooad = (Button) findViewById(R.id.button7);
        st = (Button) findViewById(R.id.button10);
        bda = (Button) findViewById(R.id.button8);

        ci.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(SubjectPage2.this,CI.class);
                startActivity(intent);

            }
        });
    }
}