package org.androidtown.sampleintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);
        Button backButton = (Button) findViewById(R.id.button2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent=new Intent();
                resultIntent.putExtra("name"," good");
                resultIntent.putExtra("twice"," very good");
                setResult(RESULT_OK,resultIntent);
                finish();
            }
        });
    }
}
