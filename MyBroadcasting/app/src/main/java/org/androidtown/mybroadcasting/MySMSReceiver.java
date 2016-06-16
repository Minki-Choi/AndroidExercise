package org.androidtown.mybroadcasting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MySMSReceiver extends BroadcastReceiver {

    private static final String TAG="MySMSReceiver";

    public MySMSReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"onReceive.");


        Intent myIntent=new Intent(context,MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(myIntent);
        //If flag is none=>Error! Activity can be popped when we didn't implement the app.
        //When we want to show the screen without starting the app, we need flag.
        //If the app is started already, new screen cannot be popped.
        //But intent will be delivered ,because extra data can exist in there.
    }
}
