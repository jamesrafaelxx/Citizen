package com.example.citizensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class update_ai_pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_ai_pass);
    }

    public void openupdate_ai(View view) {
        startActivity(new Intent(this, update_ai.class));
    }
}