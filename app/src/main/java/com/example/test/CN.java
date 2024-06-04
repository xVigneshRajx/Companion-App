package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class CN extends AppCompatActivity {
    private Button unit1, unit2, unit3, unit4, unit5;

    DatabaseReference storageReference;
    String message;
    FirebaseFirestore db;
    DatabaseReference database;
    DatabaseReference ref;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cn_page);

        unit1 = (Button) findViewById(R.id.unit1);
        unit2 = (Button) findViewById(R.id.unit2);
        unit3 = (Button) findViewById(R.id.unit3);
        unit4 = (Button) findViewById(R.id.unit4);
        unit5 = (Button) findViewById(R.id.unit5);

        unit1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2Funit1.pdf?alt=media&token=3e02d3bd-eda2-4256-813a-fe7c6872cbbf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
                Toast.makeText(CN.this, "File is Downloaded", Toast.LENGTH_SHORT).show();
            }
        });
        unit2.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FUnit%20II%20WT.pdf?alt=media&token=97458b95-5d5d-4c42-8506-36944d2a1720");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
                Toast.makeText(CN.this, "File is Downloaded", Toast.LENGTH_SHORT).show();
            }
        });
        unit3.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FWT%20Unit%20III%20(1).pdf?alt=media&token=3b2ac654-6602-49f7-ace2-3e11d2e95d99");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
                Toast.makeText(CN.this, "File is Downloaded", Toast.LENGTH_SHORT).show();
            }
        });
        unit4.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FWT%20UNit%20IV.pdf?alt=media&token=6632283e-0aa9-4d9a-b2d2-bed2f5de440b");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
                Toast.makeText(CN.this, "File is Downloaded", Toast.LENGTH_SHORT).show();
            }
        });
        unit5.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/test-23d3b.appspot.com/o/OddSem%2FWT%2FWT%20-%20UNIT%20V.pdf?alt=media&token=73ff8958-6f43-476c-b6cb-6aca2c8807a8");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
                Toast.makeText(CN.this, "File is Downloaded", Toast.LENGTH_SHORT).show();
            }
        });



    }
}