package com.example.mdaum.practicelab3real;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.mdaum.practicelab3real.R;

public class MainActivity extends AppCompatActivity {
    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imv=(ImageView)findViewById(R.id.iV);
        imv.setBackgroundResource(R.drawable.mylist);
        ((AnimationDrawable) imv.getBackground()).start();//don't do this in future dont start animation on create
    }
}
