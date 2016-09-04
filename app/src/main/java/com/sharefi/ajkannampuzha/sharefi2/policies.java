package com.sharefi.ajkannampuzha.sharefi2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class policies extends AppCompatActivity {
    Bundle bundle =getIntent().getExtras();
    public final String memail=bundle.getString("email");
    public final String mpassword=bundle.getString("password");
    public int count=0;
    public static final int WIFI_STATE=0;
    public static final int CHANGE_WIFI=0;
    public static final int COARSE_LOCATION=0;
    public static final int FINE_LOCATION=0;
    public static final int NETWORK_STATE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);
        Button mButton=(Button)findViewById( R.id.button);
        mButton.setEnabled(false);
        CheckBox aCheckBox= (CheckBox) findViewById( R.id.checkBox);
        CheckBox bCheckBox= ( CheckBox ) findViewById( R.id.checkBox2);
        CheckBox cCheckBox= ( CheckBox ) findViewById( R.id.checkBox3);
        CheckBox dCheckBox= ( CheckBox ) findViewById( R.id.checkBox4);
        aCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {   Log.d("FIrst","In here");
                    count++;
                    if (ContextCompat.checkSelfPermission(policies.this,
                            Manifest.permission.ACCESS_WIFI_STATE)
                            != PackageManager.PERMISSION_GRANTED) {
                            // No explanation needed, we can request the permission.
                            ActivityCompat.requestPermissions(policies.this,
                                    new String[]{Manifest.permission.ACCESS_WIFI_STATE},
                                    WIFI_STATE);
                    }
                    if (ContextCompat.checkSelfPermission(policies.this,
                            Manifest.permission.CHANGE_WIFI_STATE)
                            != PackageManager.PERMISSION_GRANTED) {
                        // No explanation needed, we can request the permission.
                        ActivityCompat.requestPermissions(policies.this,
                                new String[]{Manifest.permission.CHANGE_WIFI_STATE},
                                CHANGE_WIFI);
                    }

                }else{
                    count--;
                }

            }
        });
        bCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    count++;
                    if (ContextCompat.checkSelfPermission(policies.this,
                            Manifest.permission.ACCESS_COARSE_LOCATION)
                            != PackageManager.PERMISSION_GRANTED) {
                        // No explanation needed, we can request the permission.
                        ActivityCompat.requestPermissions(policies.this,
                                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                                COARSE_LOCATION);
                    }
                    if (ContextCompat.checkSelfPermission(policies.this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            != PackageManager.PERMISSION_GRANTED) {
                        // No explanation needed, we can request the permission.
                        ActivityCompat.requestPermissions(policies.this,
                                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                                FINE_LOCATION);
                    }


                }else{
                    count--;
                }

            }
        });
        cCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    count++;
                    if (ContextCompat.checkSelfPermission(policies.this,
                            Manifest.permission.ACCESS_NETWORK_STATE)
                            != PackageManager.PERMISSION_GRANTED) {
                        // No explanation needed, we can request the permission.
                        ActivityCompat.requestPermissions(policies.this,
                                new String[]{Manifest.permission.ACCESS_NETWORK_STATE},
                                NETWORK_STATE);
                    }

                }else{
                    count--;
                }

            }
        });
        dCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    count++;

                }else{
                    count--;
                }

            }
        });
        if(count==4){
            mButton.setEnabled(true);
            mButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View V){
                    Intent i = new Intent(policies.this, confirm_activity.class);
                    Bundle bundle= new Bundle();
                    bundle.putString("email",memail);
                    bundle.putString("password",mpassword);
                    i.putExtras(bundle);
                    startActivity(i);
                }
            });

        }
    }

}
