package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FrontPage extends AppCompatActivity {

    private Button button;
    private ImageView img1;
    EditText Search;
    ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        img1 = (ImageView) findViewById(R.id.scroll1) ;


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontPage.this,Login.class);
                startActivity(intent);

            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontPage.this,Announcement.class);
                startActivity(intent);
            }
        });

        String[] values ={
                "Announcement","Student Info","Notes","Calculator","Map","Calender"
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        final AutoCompleteTextView editText = findViewById(R.id.actv);

        editText.setAdapter(arrayAdapter);
        
       editText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position == 0) {
                    startActivity(new Intent(FrontPage.this,InfoPage2.class));
               }
           }
       });
    }

}








//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int index, long id) {
//                String president = ((EditText) view).getText().toString();
//                Intent intent = null;
//
//                if (president.equals("Announcement"))
//                    intent = new Intent(FrontPage.this, Announcement.class);
//                if (president.equals("Student Info"))
//                    intent = new Intent(FrontPage.this, InfoPage.class);
//                if (president.equals("Notes"))
//                    intent = new Intent(FrontPage.this, NotePage1.class);
//                if (president.equals("Calculator"))
//                    intent = new Intent(FrontPage.this, CalPage.class);
//                if (president.equals("Map"))
//                    intent = new Intent(FrontPage.this, MapPage.class);
//                if (president.equals("Calender"))
//                    intent = new Intent(FrontPage.this, CalendarPage.class);
//
//                if (intent != null) {
//                    intent.putExtra("KEY", president);
//                    startActivity(intent);
//
//                }
//            }
//        });


