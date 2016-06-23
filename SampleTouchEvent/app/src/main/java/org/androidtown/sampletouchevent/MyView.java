package org.androidtown.sampletouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by MK on 2016-06-23.
 */
public class MyView extends View {
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN) {
            Log.d("MyView","On touch state");
        }
        else if(event.getAction()==MotionEvent.ACTION_UP){
            Log.d("MyView","Don't care state.");
        }
        else if(event.getAction()==MotionEvent.ACTION_MOVE){
            Log.d("MyView","Finger is moving on screen");
        }
        return true;
    }
}
