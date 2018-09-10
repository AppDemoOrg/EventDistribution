package com.abt.eventdistribution;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "dispatchTouchEvent");
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d("MainActivity", "ACTION_DOWN");
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.d("MainActivity", "ACTION_UP");
        } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.d("MainActivity", "ACTION_CANCEL");
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.d("MainActivity", "ACTION_MOVE");
        }
        //return true;
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "onTouchEvent");
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d("MainActivity", "ACTION_DOWN");
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.d("MainActivity", "ACTION_UP");
        } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.d("MainActivity", "ACTION_CANCEL");
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.d("MainActivity", "ACTION_MOVE");
        }
        return true;
        //return super.onTouchEvent(event);
    }
}
