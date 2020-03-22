package com.example.file_sharing;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartPage extends Activity {
    ImageButton imgButton1,imgButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        imgButton1 =(ImageButton)findViewById(R.id.imageButton4);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, Register1.class);
                startActivity(intent);
            }
        });

        imgButton2=(ImageButton)findViewById(R.id.imageButton3);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, Register.class);
                startActivity(intent);
            }
        });
    }
}