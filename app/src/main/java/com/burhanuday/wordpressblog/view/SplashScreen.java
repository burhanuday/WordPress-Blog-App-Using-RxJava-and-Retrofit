package com.burhanuday.wordpressblog.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.burhanuday.wordpressblog.R;
import com.burhanuday.wordpressblog.view.Home;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        startActivity(new Intent(this, Home.class));
    }
}