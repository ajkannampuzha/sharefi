package com.sharefi.ajkannampuzha.sharefi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class policies extends AppCompatActivity {
    Bundle bundle =getIntent().getExtras();
    public final String memail=bundle.getString("email");
    public final String mpassword=bundle.getString("password");
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
