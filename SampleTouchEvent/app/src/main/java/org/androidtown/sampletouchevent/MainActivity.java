package org.androidtown.sampletouchevent;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this,"On landscape mode",Toast.LENGTH_SHORT).show();
        }

        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this,"On portrait mode",Toast.LENGTH_SHORT).show();
        }
        super.onConfigurationChanged(newConfig);
    }
}
