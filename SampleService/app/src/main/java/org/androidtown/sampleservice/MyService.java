package org.androidtown.sampleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service implements Runnable {

    public static final String TAG="MyService";
    private int count = 0;

    public void onCreate() {
       super.onCreate();

        Thread myThread=new Thread(this);
        myThread.start();
    }

    @Override
    public void run() {
        while(true) {
            Log.i(TAG,"My service called #"+ count);
            count++;

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Log.e(TAG, e.toString());
            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
