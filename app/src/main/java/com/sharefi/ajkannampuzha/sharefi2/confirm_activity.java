package com.sharefi.ajkannampuzha.sharefi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class confirm_activity extends AppCompatActivity {
    Bundle bundle =getIntent().getExtras();
    public final String memail=bundle.getString("email");
    public final String mpassword=bundle.getString("password");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_activity);
    }
}
