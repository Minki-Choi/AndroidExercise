package org.androidtown.samplesmsreceiver;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch(requestCode) {
            case 1: {
                if(grantResults.length>0 &&
                        grantResults[0]==PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this,"Permission is accepted",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this,"Permission is not accepted",Toast.LENGTH_SHORT).show();
                }

                return;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int permissionCheck= ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS);

        if(permissionCheck== PackageManager.PERMISSION_GRANTED) {
            Toast.makeText
                    (getApplicationContext(),"SMS receiver right is exist",Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText
                    (getApplicationContext(),"SMS receiver right is not exist",Toast.LENGTH_SHORT).show();
            if(ActivityCompat.shouldShowRequestPermissionRationale(
                    this,Manifest.permission.RECEIVE_SMS)) {
                Toast.makeText(getApplicationContext(),"You need SMS receiver right!",Toast.LENGTH_SHORT).show();
            }
            else {
                ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.RECEIVE_SMS},1);
            }
        }

    }
}
