package com.example.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FrameActivity extends FragmentActivity {

    private Fragment mFragments[];
    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private RadioButton rbtMain,rbtTbbs,rbtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        mFragments = new Fragment[3];
        fragmentManager = getSupportFragmentManager();
        mFragments[0] = fragmentManager.findFragmentById(R.id.fragment_main);
        mFragments[1] = fragmentManager.findFragmentById(R.id.fragment_tbbs);
        mFragments[2] = fragmentManager.findFragmentById(R.id.fragment_home);
        fragmentTransaction = fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);
        fragmentTransaction.show(mFragments[0]).commit();

        rbtMain = (RadioButton)findViewById(R.id.radioMain);
        rbtTbbs = (RadioButton)findViewById(R.id.radioTbbs);
        rbtHome = (RadioButton)findViewById(R.id.radioHome);
        rbtMain.setBackgroundResource(R.drawable.shape);

        radioGroup = (RadioGroup)findViewById(R.id.bottomGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.i("radioGroup", "checkId=" + checkedId);
                fragmentTransaction = fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);


                switch(checkedId){
                    case R.id.radioMain:
                        fragmentTransaction.show(mFragments[0]).commit();
                        rbtMain.setBackgroundResource(R.drawable.shape);
                        break;
                    case R.id.radioTbbs:
                        fragmentTransaction.show(mFragments[1]).commit();
                        rbtMain.setBackgroundResource(R.drawable.shape);
                        break;
                    case R.id.radioHome:
                        fragmentTransaction.show(mFragments[2]).commit();
                        rbtMain.setBackgroundResource(R.drawable.shape);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
