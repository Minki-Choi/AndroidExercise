package org.androidtown.sampletouchevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout=(LinearLayout) findViewById(R.id.container);
        final TextView textView=(TextView) findViewById(R.id.textView);

        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN) {
                    textView.setText("On touch state");
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    textView.setText("Don't care state.");
                }
                return true;
            }
        });
    }
}
