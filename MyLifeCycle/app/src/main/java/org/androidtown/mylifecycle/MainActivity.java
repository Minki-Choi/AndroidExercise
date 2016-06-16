package org.androidtown.mylifecycle;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"OnCreate 호출",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(),"OnStop 호출",Toast.LENGTH_SHORT).show();
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"onDestroy 호출",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        saveScore();
        Toast.makeText(getApplicationContext(),"onPause 호출",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        loadScore();
        Toast.makeText(getApplicationContext(),"onResume 호출",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"onStart 호출",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    private void saveScore() {
        SharedPreferences pref=getSharedPreferences("GoStop", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt("score",10000);
        editor.commit();
    }

    private void loadScore() {
        SharedPreferences pref=getSharedPreferences("GoStop",Activity.MODE_PRIVATE);
        int score=pref.getInt("score",0);
        Toast.makeText(getApplicationContext(),score+"점!!",Toast.LENGTH_SHORT).show();
    }
}
