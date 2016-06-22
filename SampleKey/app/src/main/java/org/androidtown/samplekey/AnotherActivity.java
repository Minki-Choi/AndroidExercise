package org.androidtown.samplekey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);
    }

    public void onButton2Clicked (View v) {
        finish();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            close();

            return true;
        }
        return false;
    }

    public void close () {
        Intent intent=new Intent();
        intent.putExtra("result","Minki");
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}
