package com.sharefi.ajkannampuzha.sharefi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class policies extends AppCompatActivity {
    Bundle bundle =getIntent().getExtras();
    public final String email=bundle.getString("email");
    public final String password=bundle.getString("password");
    public int count=0;

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
                {
                    count++;

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
            //// TODO: 8/30/2016 Bundle values of email and password and move on to the next activity 
        }
    }
}
