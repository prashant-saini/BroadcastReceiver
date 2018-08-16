package com.example.android.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastInBuilt extends BroadcastReceiver {

    //Set reciever and intent filter in manifest file.

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Battery is Low, Please Charge",Toast.LENGTH_SHORT).show();
    }
}
