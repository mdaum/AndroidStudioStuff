package com.example.mdaum.touchrecorder;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
            float x;
            float y;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                View myView = findViewById(R.id.goo);
                myView.setOnTouchListener(new View.OnTouchListener() { //listener is hit several times in one touch
                                                                       //doesnt really matter as diff is only a pixel or so
                                                                        //and this is meant to record actions as to make bots...
                    public boolean onTouch(View v, MotionEvent event) {
                        x=event.getX();
                        y=event.getY();
                        TextView change = (TextView)findViewById(R.id.out);
                        change.setText("Your x position is: "+x +"\nYour y position is: "+y);
                        return true;
                    }
                });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
