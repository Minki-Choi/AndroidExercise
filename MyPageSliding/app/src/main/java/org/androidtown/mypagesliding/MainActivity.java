package org.androidtown.mypagesliding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button button1;
    LinearLayout slidingPanel;
    Animation translationLeft;
    Animation translationRight;
    boolean isSlidingScreenOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slidingPanel=(LinearLayout) findViewById(R.id.slidingPanel);
        button1=(Button) findViewById(R.id.button1);
        translationLeft= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate_left);
        translationRight= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate_right);
        translationLeft.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button1.setText("Close");
                isSlidingScreenOn=true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        translationRight.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button1.setText("Open");
                isSlidingScreenOn=false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSlidingScreenOn) {
                    slidingPanel.startAnimation(translationLeft);
                    slidingPanel.setVisibility(View.VISIBLE);
                }
                else {
                    slidingPanel.startAnimation(translationRight);
                    slidingPanel.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
