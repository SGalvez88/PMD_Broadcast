package com.example.pmd_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MiBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context,"Cargador Conectado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context,"Cargador desconectado", Toast.LENGTH_SHORT).show();
        }
    }
}
