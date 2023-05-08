package com.example.citizensample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class citizen_profile_ai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_profile_ai);
    }

    public void opencitizen_profile_pi(View view) {
        startActivity(new Intent(this,citizen_profile_pi.class));


    }

    public void opencitizen_profile_pc(View view) {
        startActivity(new Intent(this,citizen_profile_pc.class));


    }


    public void openupdate_ai(View view) {
        startActivity(new Intent(this, update_ai.class));
    }
}