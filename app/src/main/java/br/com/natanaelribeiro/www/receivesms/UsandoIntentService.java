package br.com.natanaelribeiro.www.receivesms;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 631610277 on 04/06/16.
 */
public class UsandoIntentService extends IntentService {

    public UsandoIntentService() {
        super("UsandoIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e("INTENTSERVICE", "onHandleIntent");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onCreate() {
        Log.e("INTENTSERVICE", "onCreate");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.e("INTENTSERVICE", "onDestroy");
        super.onDestroy();
    }
}
