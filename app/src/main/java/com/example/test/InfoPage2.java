package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class InfoPage2 extends AppCompatActivity {

    DatabaseReference reference;
    Button getData;
    EditText editTextId;
    TextView nameValue, dobValue, genderValue, deptValue;
    TextView first, second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_info_page2);

        getData = findViewById(R.id.getDataButton);
        editTextId = findViewById(R.id.searchData);

        nameValue = findViewById(R.id.nameHolder);
        dobValue = findViewById(R.id.dobHolder);
        genderValue = findViewById(R.id.genderHolder);
        deptValue = findViewById(R.id.deptHolder);
        first = findViewById(R.id.mark1);
        second = findViewById(R.id.mark2);

        getData.setOnClickListener(view -> {
            String name = editTextId.getText().toString();
            if(!name.isEmpty()){
                readData(name);
            }
            else{
                Toast.makeText(InfoPage2.this,"Enter a Roll No.!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void readData(String name){
        reference = FirebaseDatabase.getInstance("https://test-23d3b-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("Students");
        reference.child(name).get().addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                if(task.getResult().exists()){
                    Toast.makeText(InfoPage2.this,"Successfully Read Data",Toast.LENGTH_SHORT).show();
                    DataSnapshot dataSnapshot = task.getResult();
                    String studentName = String.valueOf(dataSnapshot.child("name").getValue());
                    String studentDob = String.valueOf(dataSnapshot.child("dob").getValue());
                    String studentGender = String.valueOf(dataSnapshot.child("gender").getValue());
                    String studentDept = String.valueOf(dataSnapshot.child("reg").getValue());
                    String studentMark1 = String.valueOf(dataSnapshot.child("mark1").getValue());
                    String studentMark2 = String.valueOf(dataSnapshot.child("mark2").getValue());

                    nameValue.setText(studentName);
                    dobValue.setText(studentDob);
                    genderValue.setText(studentGender);
                    deptValue.setText(studentDept);
                    first.setText(studentMark1);
                    second.setText(studentMark2);



                }
                else{
                    Toast.makeText(InfoPage2.this, "User Doesn't Exist", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(InfoPage2.this, "Failed to read", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(InfoPage2.this, "Failed to collect", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
