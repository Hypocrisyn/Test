package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IdeaActivity extends AppCompatActivity {

    private EditText idea;
    private Button  ideabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea);

        ideabtn = (Button)findViewById(R.id.ideabtn);
        ideabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"您的意见我们已收到，会尽快给您反馈",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
