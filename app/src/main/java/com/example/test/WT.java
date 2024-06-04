package com.example.test;

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

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class WT extends AppCompatActivity implements View.OnClickListener {
    private Button unit1, unit2, unit3, unit4, unit5;

    DownloadManager manager;
    public static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_wt_page);
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

        Toast.makeText(WT.this, "File is Downloaded", Toast.LENGTH_SHORT).show();

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.unit1:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2Funit1.pdf?alt=media&token=3e02d3bd-eda2-4256-813a-fe7c6872cbbf","WT Unit-1.pdf");
                break;

            case R.id.unit2:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FUnit%20II%20WT.pdf?alt=media&token=97458b95-5d5d-4c42-8506-36944d2a1720","WT Unit-2.pdf");
                break;

            case R.id.unit3:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FWT%20Unit%20III%20(1).pdf?alt=media&token=3b2ac654-6602-49f7-ace2-3e11d2e95d99","WT Unit-3.pdf");
                break;
            case R.id.unit4:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FWT%20UNit%20IV.pdf?alt=media&token=6632283e-0aa9-4d9a-b2d2-bed2f5de440b","WT Unit-4.pdf");
                break;
            case R.id.unit5:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FWT%20-%20UNIT%20V.pdf?alt=media&token=73ff8958-6f43-476c-b6cb-6aca2c8807a8","WT Unit-5.pdf");
                break;

        }
    }
}















