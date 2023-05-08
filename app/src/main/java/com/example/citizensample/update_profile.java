package com.example.citizensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class update_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
    }


    public void opencitizen_profile_pi(View view) {
        startActivity(new Intent(this,citizen_profile_pi.class));


    }


    public void open_update_ai(View view) {
    }
}
