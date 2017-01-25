package com.example.mdaum.lab2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private boolean b1Toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.textView);
        b1Toggle=false;
    }

    void doButton1(View v){
        Log.v("Tag","Pressed Button 1");
        Button b1 =(Button)findViewById(R.id.button1);
        if(b1Toggle) {
            b1.setBackgroundResource(R.drawable.cloudboco);
            b1Toggle=false;
        }
        else{
            b1.setBackgroundColor(Color.parseColor("#FFFF0000"));
            b1Toggle=true;

        }
        text.setText("button1!");

}

    void doButton2(View v){
        Log.v("Tag","Pressed Button 2");
        text.setText("button2!");
    }

}
