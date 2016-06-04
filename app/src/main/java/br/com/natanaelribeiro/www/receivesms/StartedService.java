package br.com.natanaelribeiro.www.receivesms;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by 631610277 on 04/06/16.
 */
public class StartedService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("SERVICE", "OnCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("SERVICE", "OnStartCommand");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopSelf();

        return 1;
    }

    @Override
    public void onDestroy() {
        Log.e("SERVICE", "OnDestroy");
        super.onDestroy();
    }
}
