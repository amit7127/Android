package com.example.ameeet.bestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int first,second,flag,eq;
    TextView displaytv,numbertv;
    Button clearbtn,onebtn,twobtn,threebtn,fourbtn,fivebtn,sixbtn,sevenbtn,eightbtn,ninebtn,zerobtn,plusbtn,minusbtn,multiplybtn,devidbtn,equalsbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displaytv=(TextView)findViewById(R.id.tvdisplay);
        numbertv=(TextView)findViewById(R.id.tvnumber);

        onebtn=(Button)findViewById(R.id.btnone);
        twobtn=(Button)findViewById(R.id.btntwo);
        threebtn=(Button)findViewById(R.id.btnthree);
        fourbtn=(Button)findViewById(R.id.btnfour);
        fivebtn=(Button)findViewById(R.id.btnfive);
        sixbtn=(Button)findViewById(R.id.btnsix);
        sevenbtn=(Button)findViewById(R.id.btnseven);
        eightbtn=(Button)findViewById(R.id.btneight);
        ninebtn=(Button)findViewById(R.id.btnnine);
        zerobtn=(Button)findViewById(R.id.btnzero);
        equalsbtn=(Button)findViewById(R.id.btnequals);
        multiplybtn=(Button)findViewById(R.id.btnmultiply);
        devidbtn=(Button)findViewById(R.id.btndevid);
        plusbtn=(Button)findViewById(R.id.btnplus);
        minusbtn=(Button)findViewById(R.id.btnminus);
        clearbtn=(Button)findViewById(R.id.btnclear);

        onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "1");
                    numbertv.setText(numbertv.getText().toString() + "1");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "2");
                    numbertv.setText(numbertv.getText().toString() + "2");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        threebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "3");
                    numbertv.setText(numbertv.getText().toString() + "3");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        fourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "4");
                    numbertv.setText(numbertv.getText().toString() + "4");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        fivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "5");
                    numbertv.setText(numbertv.getText().toString() + "5");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        sixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "6");
                    numbertv.setText(numbertv.getText().toString() + "6");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        sevenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "7");
                    numbertv.setText(numbertv.getText().toString() + "7");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        eightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "8");
                    numbertv.setText(numbertv.getText().toString() + "8");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        ninebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "9");
                    numbertv.setText(numbertv.getText().toString() + "9");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + "0");
                    numbertv.setText(numbertv.getText().toString() + "0");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + " + ");
                    first = Integer.parseInt(numbertv.getText().toString());
                    numbertv.setText("");
                    flag = 1;
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + " - ");
                    first = Integer.parseInt(numbertv.getText().toString());
                    numbertv.setText("");
                    flag = 2;
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        multiplybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + " x ");
                    first = Integer.parseInt(numbertv.getText().toString());
                    numbertv.setText("");
                    flag = 3;
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        devidbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    displaytv.setText(displaytv.getText().toString() + " / ");
                    first = Integer.parseInt(numbertv.getText().toString());
                    numbertv.setText("");
                    flag = 4;
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
        equalsbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(eq==0) {
                    eq = 1;
                    displaytv.setText(displaytv.getText().toString() + " = ");
                    second = Integer.parseInt(numbertv.getText().toString());
                    if (flag == 1) {
                        int r = first + second;
                        displaytv.setText(displaytv.getText().toString() + r);
                    } else if (flag == 2) {
                        int r = first - second;
                        displaytv.setText(displaytv.getText().toString() + r);
                    } else if (flag == 3) {
                        int r = first * second;
                        displaytv.setText(displaytv.getText().toString() + r);
                    } else if (flag == 4) {
                        int r = first / second;
                        displaytv.setText(displaytv.getText().toString() + r);
                    }
                    numbertv.setText("");
                }
                else
                {
                    numbertv.setText("");
                    displaytv.setText("");
                    eq=0;
                }
            }
        });
       clearbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               numbertv.setText("");
               displaytv.setText("");
               eq=0;
           }
       });
    }
}
