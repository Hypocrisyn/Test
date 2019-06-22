package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {

    @Nullable
    private TextView baihe,xianrenzhang,xiangrikui,duorou,zhenzhudiaolan,haitanghua,luhui,yujinxaing;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main,container);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView)getView().findViewById(R.id.maintext);
        tv.setText("");

        baihe= getActivity().findViewById(R.id.rdo_main_baihe);
        xianrenzhang= getActivity().findViewById(R.id.rdo_main_xianrenzhang);
        xiangrikui= getActivity().findViewById(R.id.rdo_main_xiangrikui);
        duorou= getActivity().findViewById(R.id.rdo_main_duorou);
        zhenzhudiaolan= getActivity().findViewById(R.id.rdo_main_zhenzhudiaolan);
        haitanghua= getActivity().findViewById(R.id.rdo_main_haitanghua);
        luhui= getActivity().findViewById(R.id.rdo_main_luhui);
        yujinxaing= getActivity().findViewById(R.id.rdo_main_yujixiang);

        baihe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_baihe) {
                    Intent listbaihe = new Intent(getActivity(), BaiheActivity.class);
                    startActivity(listbaihe);
                }
            }
        });

        xianrenzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_xianrenzhang) {
                    Intent listxiangrikui = new Intent(getActivity(), XianrenzhangActivity.class);
                    startActivity(listxiangrikui);
                }
            }
        });

        xiangrikui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_xiangrikui) {
                    Intent listxianrenzhang = new Intent(getActivity(), XianrenzhangActivity.class);
                    startActivity(listxianrenzhang);
                }
            }
        });

        duorou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_duorou) {
                    Intent listduorou = new Intent(getActivity(), DuorouActivity.class);
                    startActivity(listduorou);
                }
            }
        });

        zhenzhudiaolan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_zhenzhudiaolan) {
                    Intent listzhenzhudiaolan = new Intent(getActivity(), ZhenzhudiaolanActivity.class);
                    startActivity(listzhenzhudiaolan);
                }
            }
        });

        haitanghua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_haitanghua) {
                    Intent listhaitanghua = new Intent(getActivity(), HaitanghuaActivity.class);
                    startActivity(listhaitanghua);
                }
            }
        });

        luhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_luhui) {
                    Intent listluhui = new Intent(getActivity(), LuhuiActivity.class);
                    startActivity(listluhui);
                }
            }
        });

        yujinxaing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.rdo_main_yujixiang) {
                    Intent listyujinxiang = new Intent(getActivity(), YujinxiangActivity.class);
                    startActivity(listyujinxiang);
                }
            }
        });

    };

}

