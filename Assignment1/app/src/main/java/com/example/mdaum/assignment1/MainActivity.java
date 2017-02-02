package com.example.mdaum.assignment1;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    HashMap<Button,ArrayList<Button>> buttonMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapButtons();
        setupGame();
    }
    void mapButtons(){ //maps all switches to their squares
        ArrayList<Button> A=new ArrayList<Button>();
        A.add((Button)findViewById(R.id.button0));A.add((Button)findViewById(R.id.button1));A.add((Button)findViewById(R.id.button2));
        ArrayList<Button> B=new ArrayList<Button>();
        B.add((Button)findViewById(R.id.button3));B.add((Button)findViewById(R.id.button7));B.add((Button)findViewById(R.id.button9));B.add((Button)findViewById(R.id.button11));
        ArrayList<Button> C=new ArrayList<Button>();
        C.add((Button)findViewById(R.id.button4));C.add((Button)findViewById(R.id.button10));C.add((Button)findViewById(R.id.button14));C.add((Button)findViewById(R.id.button15));
        ArrayList<Button> D=new ArrayList<Button>();
        D.add((Button)findViewById(R.id.button0));D.add((Button)findViewById(R.id.button4));D.add((Button)findViewById(R.id.button5));D.add((Button)findViewById(R.id.button6));D.add((Button)findViewById(R.id.button7));
        ArrayList<Button> E=new ArrayList<Button>();
        E.add((Button)findViewById(R.id.button6));E.add((Button)findViewById(R.id.button7));E.add((Button)findViewById(R.id.button8));E.add((Button)findViewById(R.id.button10));E.add((Button)findViewById(R.id.button12));
        ArrayList<Button> F=new ArrayList<Button>();
        F.add((Button)findViewById(R.id.button0));F.add((Button)findViewById(R.id.button2));F.add((Button)findViewById(R.id.button14));F.add((Button)findViewById(R.id.button15));
        ArrayList<Button> G=new ArrayList<Button>();
        G.add((Button)findViewById(R.id.button3));G.add((Button)findViewById(R.id.button14));G.add((Button)findViewById(R.id.button15));
        ArrayList<Button> H=new ArrayList<Button>();
        H.add((Button)findViewById(R.id.button4));H.add((Button)findViewById(R.id.button5));H.add((Button)findViewById(R.id.button7));H.add((Button)findViewById(R.id.button14));H.add((Button)findViewById(R.id.button15));
        ArrayList<Button> I=new ArrayList<Button>();
        I.add((Button)findViewById(R.id.button1));I.add((Button)findViewById(R.id.button2));I.add((Button)findViewById(R.id.button3));I.add((Button)findViewById(R.id.button4));I.add((Button)findViewById(R.id.button5));
        ArrayList<Button> J=new ArrayList<Button>();
        J.add((Button)findViewById(R.id.button3));J.add((Button)findViewById(R.id.button4));J.add((Button)findViewById(R.id.button5));J.add((Button)findViewById(R.id.button9));J.add((Button)findViewById(R.id.button13));
        buttonMap=new HashMap<Button,ArrayList<Button>>();
        buttonMap.put((Button)findViewById(R.id.buttonA),A);
        buttonMap.put((Button)findViewById(R.id.buttonB),B);
        buttonMap.put((Button)findViewById(R.id.buttonC),C);
        buttonMap.put((Button)findViewById(R.id.buttonD),D);
        buttonMap.put((Button)findViewById(R.id.buttonE),E);
        buttonMap.put((Button)findViewById(R.id.buttonF),F);
        buttonMap.put((Button)findViewById(R.id.buttonG),G);
        buttonMap.put((Button)findViewById(R.id.buttonH),H);
        buttonMap.put((Button)findViewById(R.id.buttonI),I);
        buttonMap.put((Button)findViewById(R.id.buttonJ),J);

    }
    void setupGame(){
        ArrayList<Button>squares;
        squares=new ArrayList<Button>();
        squares.add((Button)findViewById(R.id.button0));
        squares.add((Button)findViewById(R.id.button1));
        squares.add((Button)findViewById(R.id.button2));
        squares.add((Button)findViewById(R.id.button3));
        squares.add((Button)findViewById(R.id.button4));
        squares.add((Button)findViewById(R.id.button5));
        squares.add((Button)findViewById(R.id.button6));
        squares.add((Button)findViewById(R.id.button7));
        squares.add((Button)findViewById(R.id.button8));
        squares.add((Button)findViewById(R.id.button9));
        squares.add((Button)findViewById(R.id.button10));
        squares.add((Button)findViewById(R.id.button11));
        squares.add((Button)findViewById(R.id.button12));
        squares.add((Button)findViewById(R.id.button13));
        squares.add((Button)findViewById(R.id.button14));
        squares.add((Button)findViewById(R.id.button15));
        Random r = new Random();
        for (Button b:
             squares) {
            boolean color = r.nextBoolean();
            if(color) {
                b.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                b.setTextColor(Color.parseColor("#FF000000"));
            }
            else {
                b.setBackgroundColor(Color.parseColor("#FF000000"));
                b.setTextColor(Color.parseColor("#FFFFFFFF"));
            }
        }
    }

    void toggleButton(Button b){
        if(((ColorDrawable)b.getBackground()).getColor()==Color.BLACK){
            b.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            b.setTextColor(Color.parseColor("#FF000000"));
        }
        else{
            b.setBackgroundColor(Color.parseColor("#FF000000"));
            b.setTextColor(Color.parseColor("#FFFFFFFF"));
        }
    }

    void handleButton(View v){
        Button caller = (Button)v;
        ArrayList<Button>toToggle = buttonMap.get(caller);
        for (Button b:
             toToggle) {
            toggleButton(b);
        }
    }

}
