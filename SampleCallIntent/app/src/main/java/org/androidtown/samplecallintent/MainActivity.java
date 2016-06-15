package org.androidtown.samplecallintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button,button2;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        editText=(EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String telNum=editText.getText().toString();
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telNum));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.naver.com"));
                startActivity(intent);
            }
        });
    }
}
