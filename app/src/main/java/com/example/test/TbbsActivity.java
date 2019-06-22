package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TbbsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbbs);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.rdo_tbbs_wheretext){
            Intent list = new Intent(this, PlaceActivity.class);
            startActivity(list);
        }
    }
}
