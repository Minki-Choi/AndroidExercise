package org.androidtown.samplelayoutinflaater;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inflateLayout() {
        LinearLayout contentsLayout = (LinearLayout) findViewById(R.id.contentsLayout);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button, contentsLayout, true);
        //컨텐츠레이아웃에 버튼레이아웃 추가.
        Button selectButton = (Button) findViewById(R.id.selectButton);
        final CheckBox alldays = (CheckBox) findViewById(R.id.allDays);
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alldays.isChecked())
                    alldays.setChecked(false);
                else
                    alldays.setChecked(true);
            }
        });
    }

    public void onButton1Clicked(View v) {
        inflateLayout();
    }
}