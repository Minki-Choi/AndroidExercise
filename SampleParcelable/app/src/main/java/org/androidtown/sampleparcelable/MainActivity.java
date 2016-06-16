package org.androidtown.sampleparcelable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_SIMPLE_DATA="data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button1);
        TextView textView =(TextView) findViewById(R.id.textView);

        final Intent intent=new Intent(getApplicationContext(),AnotherActivity.class);
        textView.setText("Create another activity");

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleData sampleData=new SampleData(100,"Hello Android!");
                intent.putExtra(KEY_SIMPLE_DATA,sampleData);
                startActivity(intent);
            }
        });
    }

}
