package org.androidtown.myanimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RelativeLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);
        container=(RelativeLayout) findViewById(R.id.container);
    }

    public void onButton1Clicked(View v) {
        Animation translate= AnimationUtils.loadAnimation(this,R.anim.translate);
        //textView.startAnimation(translate);
        container.startAnimation(translate);
    }
}
