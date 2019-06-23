package com.example.test;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView color1,color2,color3;
    private TextView size1,size2,size3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        color1 = findViewById(R.id.color1);
        color1.setOnClickListener(this);
        size1 = findViewById(R.id.size1);
        size1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.size1){
            Resources resource1 = getBaseContext().getResources();
            Configuration configuration = resource1.getConfiguration();
            configuration.fontScale = 2.0f;
            resource1.updateConfiguration(configuration,resource1.getDisplayMetrics());
        }else if (v.getId()==R.id.size2){
            Resources resource2 = getBaseContext().getResources();
            Configuration configuration = resource2.getConfiguration();
            configuration.fontScale = 1.0f;
            resource2.updateConfiguration(configuration,resource2.getDisplayMetrics());
        }else if (v.getId()==R.id.size3){
            Resources resource3 = getBaseContext().getResources();
            Configuration configuration = resource3.getConfiguration();
            configuration.fontScale = 0.5f;
            resource3.updateConfiguration(configuration,resource3.getDisplayMetrics());
        }
    }
}
