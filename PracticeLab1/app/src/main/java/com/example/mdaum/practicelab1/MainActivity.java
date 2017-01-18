package com.example.mdaum.practicelab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int x=0;
        super.onCreate(savedInstanceState);
        x=1;
        setContentView(R.layout.activity_main);
        x=2;
        Log.v("Debug_Tag","test debug");
        x=3;
    }
}
