package com.example.akramkhan.onborading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences =  getSharedPreferences("my_preferences", MODE_PRIVATE);

// Check if onboarding_complete is false
        if(!preferences.getBoolean("onboarding_complete",false)) {
            // Start the onboarding Activity
            Intent onboarding = new Intent(this, OnboardingActivity.class);
            startActivity(onboarding);

            // Close the main Activity
            finish();
            return;
        }
    }
}
