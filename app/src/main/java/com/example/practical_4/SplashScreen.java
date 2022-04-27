package com.example.practical_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread = new Thread(){
            public void run() {
                try {
                    sleep(3500);
                }
                catch (Exception exception){
                    exception.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}