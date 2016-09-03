package com.sharefi.ajkannampuzha.sharefi2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref=getSharedPreferences("Regdata.txt", MODE_PRIVATE);
        final Boolean check=pref.getBoolean("firsttime", false);
        super.onCreate(savedInstanceState);
        if (!check) {
           // setContentView(R.layout.splashscreen);
            int secondsDelayed = 0;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                }
            }, secondsDelayed * 500);
        }
        else {
            // TODO: 8/30/2016 move to post login page after registration 
        }
    }
}
