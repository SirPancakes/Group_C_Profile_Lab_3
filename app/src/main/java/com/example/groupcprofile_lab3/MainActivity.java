package com.example.groupcprofile_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToProfile_JohnRey(View view) {
        Intent profile_johnrey_intent = new Intent(this, ProfileJohnReyActivity.class);
        startActivity(profile_johnrey_intent);
    }

    public void goToProfile_Mohit(View view) {
        Intent profile_mohit_intent = new Intent(this, ProfileMohitActivity.class);
        startActivity(profile_mohit_intent);
    }

    public void goToProfile_Daniel(View view) {
        Intent profile_daniel_intent = new Intent(this, ProfileDanielActivity.class);
        startActivity(profile_daniel_intent);
    }

    public void goToProfile_Daniyal(View view) {
        Intent profile_daniyal_intent = new Intent(this, ProfileDaniyalActivity.class);
        startActivity(profile_daniyal_intent);
    }
}