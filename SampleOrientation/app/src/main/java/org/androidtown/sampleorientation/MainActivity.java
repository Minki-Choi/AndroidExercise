package org.androidtown.sampleorientation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(this,"LandScape",Toast.LENGTH_SHORT).show();
        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
            Toast.makeText(this,"Portrait",Toast.LENGTH_SHORT).show();

        super.onConfigurationChanged(newConfig);
    }
}
