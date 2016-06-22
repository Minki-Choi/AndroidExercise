package org.androidtown.samplekey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_CODE=200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Intent intent=new Intent(this,AnotherActivity.class);
        startActivityForResult(intent,REQUEST_CODE);
    }

    public void onActivityResult(int requestCode,int resultCode,Intent intent){
        super.onActivityResult(requestCode,resultCode,intent);
        if(requestCode==REQUEST_CODE) {
            if(intent!=null) {
                String result = intent.getExtras().getString("result");
                Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
