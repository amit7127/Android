package com.example.ameeet.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button loginbtn;//alt + enter
    TextView resulttv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn= (Button)findViewById(R.id.btnlogin);//initialization
        resulttv=(TextView) findViewById(R.id.tvresult);
    }
    public void  showresult(View v)
    {
        resulttv.setText("Jspiders");
        loginbtn.setBackgroundColor(000000);
    }
}
