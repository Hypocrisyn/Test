package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

public class MainActivity extends Activity {
    String latLongString;
    Double a, b;
    private TextView city;
    private TextView showJW = null;
    private WebView webView;
    private LocationManager locationManager;

    private double latitude = 0;

    private double longitude = 0;

    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            double[] data = (double[]) msg.obj;
            showJW.setText("经度：" + data[0] + "\t纬度:" + data[1]);

            List<Address> addList = null;
            Geocoder ge = new Geocoder(getApplicationContext());
            try {
                addList = ge.getFromLocation(data[0], data[1], 1);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (addList != null && addList.size() > 0) {
                for (int i = 0; i < addList.size(); i++) {
                    Address ad = addList.get(i);
                    latLongString = ad.getLocality();
                }
            }
            city.setText(latLongString);
            Bundle bundle = new Bundle();
            bundle.putString("city", latLongString);
            Intent intent = new Intent(MainActivity.this,TbbsFragment.class);
            intent.putExtras(bundle);
            //startActivity(intent);

            //TbbsFragment fragment = new TbbsFragment();
            // 将数据 保存到 fragment 里面
            //fragment.setArguments(bundle);

            /*SharedPreferences sharedPreferences = getSharedPreferences("city", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("city", String.valueOf(city));
            editor.commit();*/
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showJW = (TextView) findViewById(R.id.showJW);
        city = (TextView) findViewById(R.id.city);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        new Thread() {
            @Override
            public void run() {
                try {
                    //需要权限的操作
                    Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    if (location != null) {
                        latitude = location.getLatitude(); // 经度
                        longitude = location.getLongitude(); // 纬度
                        double[] data = { latitude, longitude };
                        Message msg = handler.obtainMessage();
                        msg.obj = data;
                        handler.sendMessage(msg);
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                }

            }
        }.start();

        webView=(WebView)findViewById(R.id.webView1);	//获取WebView组件
        webView.getSettings().setJavaScriptEnabled(true);	//设置JavaScript可用
        webView.setWebChromeClient(new WebChromeClient());	//处理JavaScript对话框
        webView.setWebViewClient(new WebViewClient());	//处理各种通知和请求事件，如果不使用该句代码，将使用内置浏览器访问网页
        webView.loadUrl("http://m.weather.com.cn/m/pn12/weather.htm ");	//设置默认显示的天气预报信息
        webView.setInitialScale(57*4);	//放网页内容放大4倍
        Button cd=(Button)findViewById(R.id.cd);	//获取布局管理器中添加的“成都”按钮
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("101270101");
            }
        });

    }

    /**
     * 确定按钮监听
     *
     * @param view
     */
    public void getJW(View view) {
        new Thread() {
            @Override
            public void run() {
                try {
                    //需要权限的操作
                    Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    if (location != null) {
                        latitude = location.getLatitude(); // 经度
                        longitude = location.getLongitude(); // 纬度
                        double[] data = { latitude, longitude };
                        Message msg = handler.obtainMessage();
                        msg.obj = data;
                        handler.sendMessage(msg);
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }

    private void openUrl(String s) {
        webView.loadUrl("https://tianqi.so.com/weather/101270101");
    };
}

