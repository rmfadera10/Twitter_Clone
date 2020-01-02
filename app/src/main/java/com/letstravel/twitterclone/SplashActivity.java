package com.letstravel.twitterclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {


long Delay =6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer RunSplash = new Timer();
        TimerTask showSplash = new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this, IntroActivity.class );
                startActivity(intent);
                finish();
            }
        };
        RunSplash.schedule(showSplash, Delay);
    }
}
