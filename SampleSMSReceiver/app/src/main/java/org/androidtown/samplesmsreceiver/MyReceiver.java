package org.androidtown.samplesmsreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver{
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("MyReceiver","onReceive");
        if(intent.getAction().equals("android.provider.Telephony.SMS_RECEIVER")) {

            Intent myIntent=new Intent(context,MainActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            context.startActivity(myIntent);
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
