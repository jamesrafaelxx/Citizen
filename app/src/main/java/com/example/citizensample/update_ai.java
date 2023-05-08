package com.example.citizensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class update_ai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_ai);
    }

    public void openupdate_ai_pass(View view) {
        startActivity(new Intent(this, update_ai_pass.class));
    }

    public void opencitizen_profile_ai(View view) {
        startActivity(new Intent(this, citizen_profile_ai.class));
    }
}