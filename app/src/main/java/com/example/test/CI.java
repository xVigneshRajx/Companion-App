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

public class CI extends AppCompatActivity implements View.OnClickListener {
    private Button unit1, unit2, unit3, unit4, unit5;
    DownloadManager manager;
    public static final int REQUEST_CODE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ci);

        unit1 = (Button) findViewById(R.id.unit1);
        unit2 = (Button) findViewById(R.id.unit2);
        unit3 = (Button) findViewById(R.id.unit3);
        unit4 = (Button) findViewById(R.id.unit4);
        unit5 = (Button) findViewById(R.id.unit5);
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

        Toast.makeText(CI.this, "File is Downloaded", Toast.LENGTH_SHORT).show();

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.unit1:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/EvenSem%2FCI%2FUnit-%20I%20R%20.pdf?alt=media&token=379356b6-69c8-4140-8e85-90f25d015de9","CI-Unit 1.pdf");
                break;

            case R.id.unit2:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/EvenSem%2FCI%2FCI-UNIT%20II%20R%20.pdf?alt=media&token=ae02cc71-6782-4649-9a85-7bd97484998e","CI-Unit 2.pdf");
                break;

            case R.id.unit3:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/EvenSem%2FCI%2FUnit%203.pdf?alt=media&token=984a60e5-1a4f-46b7-aed5-5d01b9afc5db","CI-Unit 3.pdf");
                break;
            case R.id.unit4:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/EvenSem%2FCI%2FUNIT-IV%20NOTES%20.pdf?alt=media&token=aed26e1a-684f-412a-a951-9b71d0a1a85a","CI-Unit 4.pdf");
                break;
            case R.id.unit5:
                downloadNotes("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/EvenSem%2FCI%2FUnit%20V.pdf?alt=media&token=d9c37f69-5bd7-439d-96e0-f471673235c3","CI-Unit 5.pdf");
                break;

        }


    }
}