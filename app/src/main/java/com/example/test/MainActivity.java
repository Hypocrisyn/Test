package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView baihe,xianrenzhang,xiangrikui,duorou,zhenzhudiaolan,haitanghua,luhui,yujinxaing,plant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baihe = (TextView)findViewById(R.id.rdo_main_baihe);
        baihe.setOnClickListener(this);
        xianrenzhang = (TextView)findViewById(R.id.rdo_main_xianrenzhang);
        xianrenzhang.setOnClickListener(this);
        xiangrikui = (TextView)findViewById(R.id.rdo_main_xiangrikui);
        xiangrikui.setOnClickListener(this);
        duorou = (TextView)findViewById(R.id.rdo_main_duorou);
        duorou.setOnClickListener(this);
        zhenzhudiaolan = (TextView)findViewById(R.id.rdo_main_zhenzhudiaolan);
        zhenzhudiaolan.setOnClickListener(this);
        haitanghua = (TextView)findViewById(R.id.rdo_main_haitanghua);
        haitanghua.setOnClickListener(this);
        luhui = (TextView)findViewById(R.id.rdo_main_luhui);
        luhui.setOnClickListener(this);
        yujinxaing = (TextView)findViewById(R.id.rdo_main_yujixiang);
        yujinxaing.setOnClickListener(this);
        plant = (TextView)findViewById(R.id.rdo_main_placetext);
        plant.setOnClickListener(this);

    }
    public void onClick(View btn) {
        if (btn.getId() == R.id.rdo_main_baihe) {
            Intent listbaihe = new Intent(this, BaiheActivity.class);
            startActivity(listbaihe);
        } else if (btn.getId() == R.id.rdo_main_xiangrikui) {
            Intent listxianrenzhang = new Intent(this, XianrenzhangActivity.class);
            startActivity(listxianrenzhang);
        } else if (btn.getId() == R.id.rdo_main_xianrenzhang) {
            Intent listxiangrikui = new Intent(this, XianrenzhangActivity.class);
            startActivity(listxiangrikui);
        } else if (btn.getId() == R.id.rdo_main_duorou) {
            Intent listduorou = new Intent(this, DuorouActivity.class);
            startActivity(listduorou);
        } else if (btn.getId() == R.id.rdo_main_zhenzhudiaolan) {
            Intent listzhenzhudiaolan = new Intent(this, ZhenzhudiaolanActivity.class);
            startActivity(listzhenzhudiaolan);
        } else if (btn.getId() == R.id.rdo_main_haitanghua) {
            Intent listhaitanghua = new Intent(this, HaitanghuaActivity.class);
            startActivity(listhaitanghua);
        } else if (btn.getId() == R.id.rdo_main_luhui) {
            Intent listluhui = new Intent(this, LuhuiActivity.class);
            startActivity(listluhui);
        } else if (btn.getId() == R.id.rdo_main_yujixiang) {
            Intent listyujinxiang = new Intent(this, YujinxiangActivity.class);
            startActivity(listyujinxiang);
        } else if (btn.getId() == R.id.rdo_main_placetext) {
            Intent listmore = new Intent(this, MainFragment.class);
            startActivity(listmore);
        }
    }
}