package org.androidtown.sampleparcelable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    public static final String KEY_SIMPLE_DATA="data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Button button=(Button) findViewById(R.id.button2);
        TextView textView=(TextView) findViewById(R.id.TextView2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        SampleData sampleData = bundle.getParcelable(KEY_SIMPLE_DATA);

        textView.setText("Delivered value\n Number: "+sampleData.number
                            +"\n Message: "+sampleData.message);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
