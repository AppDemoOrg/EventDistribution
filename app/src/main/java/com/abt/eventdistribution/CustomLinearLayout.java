package com.abt.eventdistribution;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @描述： @CustomLinearLayout
 * @作者： @黄卫旗
 * @创建时间： @20/08/2018
 */
public class CustomLinearLayout extends LinearLayout {
    public CustomLinearLayout(Context context) {
        super(context);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("CustomLinearLayout", "dispatchTouchEvent");
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d("CustomLinearLayout", "ACTION_DOWN");
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.d("CustomLinearLayout", "ACTION_UP");
        } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.d("CustomLinearLayout", "ACTION_CANCEL");
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.d("CustomLinearLayout", "ACTION_MOVE");
        }
        //return true;
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("CustomLinearLayout", "onInterceptTouchEvent");
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d("CustomLinearLayout", "onInterceptTouchEvent action:ACTION_DOWN");
                //return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("CustomLinearLayout", "onInterceptTouchEvent action:ACTION_MOVE");
                return true;
                //break;
            case MotionEvent.ACTION_UP:
                Log.d("CustomLinearLayout", "onInterceptTouchEvent action:ACTION_UP");
                //return true;
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("CustomLinearLayout", "onInterceptTouchEvent action:ACTION_CANCEL");
                break;
        }
        //return true;
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("CustomLinearLayout", "onTouchEvent");
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d("CustomLinearLayout", "ACTION_DOWN");
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.d("CustomLinearLayout", "ACTION_UP");
        } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.d("CustomLinearLayout", "ACTION_CANCEL");
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.d("CustomLinearLayout", "ACTION_MOVE");
        }
        //return false;
        return super.onTouchEvent(event);
    }
}
