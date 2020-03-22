package com.example.file_sharing;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MainMenu extends Activity {
    ImageButton imgButton1,imgButton2,imgButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        imgButton1 =(ImageButton)findViewById(R.id.imageButton5);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, upload.class);
                startActivity(intent);
            }
        });

        imgButton2=(ImageButton)findViewById(R.id.imageButton6);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, login2.class);
                startActivity(intent);
            }
        });
        imgButton3=(ImageButton)findViewById(R.id.imageButton7);
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),HomeScreen.class));
        finish();
    }
}