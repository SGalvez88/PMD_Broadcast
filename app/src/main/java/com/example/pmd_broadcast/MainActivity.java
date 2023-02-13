package com.example.pmd_broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MiBroadcast miBroadcast = new MiBroadcast();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter miFlitro = new IntentFilter();
        miFlitro.addAction(Intent.ACTION_POWER_CONNECTED);
        miFlitro.addAction(Intent.ACTION_POWER_DISCONNECTED);
        registerReceiver(miBroadcast,miFlitro);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}