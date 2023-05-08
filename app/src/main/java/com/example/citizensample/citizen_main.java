package com.example.citizensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class citizen_main extends  citizen_profile_pc{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_main);
    }

    public void openCitizen_profile_pc(View view) {
        startActivity(new Intent(this,citizen_profile_pc.class));
    }
}