package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TbbsFragment extends Fragment implements Runnable{

    private final String TAG = "";

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

        where = getActivity().findViewById(R.id.rdo_tbbs_wheretext);
        where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getActivity(), PlaceActivity.class);
                startActivity(list);

            }
        });


    }

    @Override
    public void run() {
        Log.i(TAG, "run: ");
    }


    //获取当前位置


}