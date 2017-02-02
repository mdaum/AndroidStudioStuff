package com.example.mdaum.practicelab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void upTownFunk(View v){
        Log.v("TAAG","it should go up!");
    }
    void downToChinaTown(View v){
        Log.v("TAAG","it should go down!");
    }
}
