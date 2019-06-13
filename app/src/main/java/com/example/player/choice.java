package com.example.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void musicplayer(View view) {
        Intent main2Intent = new Intent(choice.this,MainActivity.class);
        startActivity(main2Intent);
        finish();
    }

    public void vrecorder(View view) {
        Intent main3Intent = new Intent(choice.this,screen.class);
        startActivity(main3Intent);
        finish();
    }



}
