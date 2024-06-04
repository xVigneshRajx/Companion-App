package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MapPage extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    ImageView img,img1,img2,img3,img4;
    boolean flag;
    int[] images ={R.drawable.ground,R.drawable.first,R.drawable.second,R.drawable.thirdf};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_map_page);
        img=(ImageView) findViewById(R.id.imageView);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);


        btn1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View arg0 ) {
                img.setImageResource ( R.drawable.ground ) ;
            }
        } ) ;
        btn2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View arg0 ) {

                img.setImageResource ( R.drawable.first ) ;
            }
        } ) ;
        btn3.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View arg0 ) {

                img.setImageResource ( R.drawable.second ) ;
            }
        } ) ;
        btn4.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View arg0 ) {

                img.setImageResource ( R.drawable.thirdf ) ;
            }
        } ) ;
    }
}
