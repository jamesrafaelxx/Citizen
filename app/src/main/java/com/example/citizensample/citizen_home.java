package com.example.citizensample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class citizen_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_home);
    }

    public void opencitizen_profile_pi(View view) {
        startActivity(new Intent(this,citizen_profile_pi.class));
    }

    public void opencitizen_prescription(View view) {
        startActivity(new Intent(this,citizen_prescription.class));
    }
}