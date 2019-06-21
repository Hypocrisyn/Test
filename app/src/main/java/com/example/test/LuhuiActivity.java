package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LuhuiActivity extends AppCompatActivity implements View.OnClickListener{

    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luhui);

        back = (TextView)findViewById(R.id.rdo_back_luhui);
        back.setOnClickListener(this);
    }

    public void onClick(View btn){
        if (btn.getId() == R.id.rdo_back_luhui) {
            Intent list = new Intent(this, MainActivity.class);
            startActivity(list);
        }
    }

}
