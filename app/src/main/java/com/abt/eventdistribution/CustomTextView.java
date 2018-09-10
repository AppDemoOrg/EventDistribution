package com.abt.eventdistribution;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * @描述： @CustomTextView
 * @作者： @黄卫旗
 * @创建时间： @20/08/2018
 */
@SuppressLint("AppCompatCustomView")
public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("CustomTextView", "dispatchTouchEvent");
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d("CustomTextView", "dispatchTouchEvent action:ACTION_DOWN");
                //return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("CustomTextView", "dispatchTouchEvent action:ACTION_MOVE");
                return true;
            //break;
            case MotionEvent.ACTION_UP:
                Log.d("CustomTextView", "dispatchTouchEvent action:ACTION_UP");
                //return true;
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("CustomTextView", "dispatchTouchEvent action:ACTION_CANCEL");
                break;
        }
        //return true;
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("CustomTextView", "onTouchEvent");
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d("CustomTextView", "ACTION_DOWN");
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.d("CustomTextView", "ACTION_UP");
        } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.d("CustomTextView", "ACTION_CANCEL");
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.d("CustomTextView", "ACTION_MOVE");
        }
        //return false;
        return super.onTouchEvent(event);
    }
}
