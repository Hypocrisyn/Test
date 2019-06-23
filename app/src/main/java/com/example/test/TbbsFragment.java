package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TbbsFragment extends Fragment {

    @Nullable
    public String message;
    @Nullable
    private TextView location,time;
    @Nullable
    private TextView where;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tbbs, container);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView) getView().findViewById(R.id.tbbsTextView);
        tv.setText("这是社区页面");

       //Bundle bundle = getArguments();
        //location = getActivity().findViewById(R.id.locationtext);
        Intent intent = getActivity().getIntent() ;
        Bundle bundle = intent.getExtras();
        //location.setText(bundle.getString("city"));
        /*SharedPreferences sharedPreferences = .getSharedPreferences("city", Activity.MODE_PRIVATE);
        String name = sharedPreferences.getString("city",city);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getActivity(), MainActivity.class);
                startActivity(list);

            }
        });*/

        time = getActivity().findViewById(R.id.timetext);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getActivity(), MainActivity.class);
                startActivity(list);

            }
        });

        where = getActivity().findViewById(R.id.rdo_tbbs_wheretext);
        where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getActivity(), PlaceActivity.class);
                startActivity(list);

            }
        });


    }




    //获取当前位置


}