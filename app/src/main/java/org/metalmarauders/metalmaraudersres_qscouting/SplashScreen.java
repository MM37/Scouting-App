package org.metalmarauders.metalmaraudersres_qscouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by rkhaj on 1/16/2016.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread() {
            public void run() {
                try{
                    sleep(1500);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
