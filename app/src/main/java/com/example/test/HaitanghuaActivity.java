package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HaitanghuaActivity extends AppCompatActivity implements View.OnClickListener{

    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haitanghua);

        back = (TextView)findViewById(R.id.rdo_back_haitanghua);
        back.setOnClickListener(this);
    }

    public void onClick(View btn){
        if (btn.getId() == R.id.rdo_back_haitanghua) {
            Intent list = new Intent(this, MainFragment.class);
            startActivity(list);
        }
    }

}
