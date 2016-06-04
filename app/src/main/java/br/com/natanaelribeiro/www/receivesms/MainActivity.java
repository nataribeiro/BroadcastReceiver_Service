package br.com.natanaelribeiro.www.receivesms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filtro = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        registerReceiver(meuReceiver, filtro);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(meuReceiver);
        super.onDestroy();
    }

    BroadcastReceiver meuReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            //MediaPlayer mp = MediaPlayer.create(context, R.raw.explosao);
            //mp.start();

            Intent intent1 = new Intent(context, UsandoIntentService.class);
            startService(intent1);
            startService(intent1);
            startService(intent1);
            startService(intent1);
            startService(intent1);
            startService(intent1);
            startService(intent1);
        }
    };
}
