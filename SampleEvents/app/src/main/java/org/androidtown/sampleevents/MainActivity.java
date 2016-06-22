package org.androidtown.sampleevents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GestureDetector mGestures=null;

    public boolean onTouchEvent(MotionEvent event) {
        if(mGestures !=null)
            return mGestures.onTouchEvent(event);
        else
            return super.onTouchEvent(event);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView1=(TextView) findViewById(R.id.textview1);
        mGestures= new GestureDetector(new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                textView1.append("\nonFling  \n\tx = "+velocityX+"\n\ty = "+velocityY);
                return super.onFling(e1, e2, velocityX, velocityY);
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                textView1.append("\nonScroll \n\tx = "+distanceX +"\n\t y = "+distanceY);
                return super.onScroll(e1, e2, distanceX, distanceY);
            }
        });
        textView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView1.append("\nonLongClick: "+v.toString());
                return true;
            }
        });

        textView1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus) {
                    textView1.append("\nonFocusChange, hasFocus : "+hasFocus);
                } else {
                    textView1.append("\nonFocusChange, hasFocus : "+hasFocus);
                }
            }
        });
    }
}
