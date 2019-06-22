package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

public class PlaceActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
    }

    public void onClick(View v) {
        if (v.getId()==R.id.rdo_tbbs_zhiwuyuan) {
            Intent list = new Intent(this, ZhiwuyuanActivity.class);
            startActivity(list);
        }else if (v.getId()==R.id.rdo_tbbs_sanshenghuaxiang) {
            Intent list = new Intent(this, SanshenghuaxiangActivity.class);
            startActivity(list);
        }else if (v.getId()==R.id.rdo_tbbs_danjingshan) {
            Intent list = new Intent(this, DanjingshanActivity.class);
            startActivity(list);
        }
    }
}
