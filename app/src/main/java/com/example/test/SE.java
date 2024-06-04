package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class SE extends AppCompatActivity implements View.OnClickListener {

    Button unit1,unit2,unit3,unit4,unit5;
    public static final int REQUEST_CODE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_se_page);
        unit1= findViewById(R.id.unit1);
        unit1.setOnClickListener(this);

        unit2 = findViewById(R.id.unit2);
        unit2.setOnClickListener(this);

        unit3 = findViewById(R.id.unit3);
        unit3.setOnClickListener(this);

        unit4 = findViewById(R.id.unit4);
        unit4.setOnClickListener(this);

        unit5 = findViewById(R.id.unit5);
        unit5.setOnClickListener(this);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
            }
        }

    }
    public void downloadNotes(String token, String fileName){

        DownloadManager downloads = (DownloadManager)  getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(token);

        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,fileName);
        long reference = downloads.enqueue(request);

        Toast.makeText(SE.this, "File is Downloaded", Toast.LENGTH_SHORT).show();

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.unit1:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FSE%2FSE-UNIT%20I%20final.pdf?alt=media&token=6a2d8925-9d4b-42e1-b83b-9f12b98b255f","subjectOne.pdf");
                break;

            case R.id.unit2:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FSE%2FSE-Unit%20II%20%20final.pdf?alt=media&token=854a4a10-228e-4850-8a2e-f9701bc5d771","subjectTwo.pdf");
                break;

            case R.id.unit3:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-77be8.appspot.com/o/Subject1.pdf?alt=media&token=94d8c799-1075-4e24-85d7-78037cfc323f","subjectThree.pdf");
                break;
            case R.id.unit4:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-77be8.appspot.com/o/Subject1.pdf?alt=media&token=94d8c799-1075-4e24-85d7-78037cfc323f","subjectFour.pdf");
                break;
            case R.id.unit5:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-77be8.appspot.com/o/Subject1.pdf?alt=media&token=94d8c799-1075-4e24-85d7-78037cfc323f","subjectFive.pdf");
                break;

        }
    }

    }
