package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TbbsFragment extends Fragment{


    @Nullable
    private TextView location,wheather,time;
    @Nullable
    private TextView where;
    private final String TAG = "";

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
        //获取当前位置
        location = getActivity().findViewById(R.id.locationtext);
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

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date curDate = new Date(System.currentTimeMillis());
                final String todayStr = sdf.format(curDate);
                time.setText("当前时间为"+todayStr);

            }
        });
        /*long newtime = System.currentTimeMillis();
        final Calendar mCalendar = Calendar.getInstance();
        mCalendar.setTimeInMillis(newtime);
        int mHour = mCalendar.get(Calendar.HOUR);
        int mMinuts = mCalendar.get(Calendar.MINUTE);
        Time t = new Time();*/
        //Date today = Calendar.getInstance().getTime();
        wheather = getActivity().findViewById(R.id.weathertext);
        wheather.setOnClickListener(new View.OnClickListener() {
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


}