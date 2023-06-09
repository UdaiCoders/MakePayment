package com.example.makepayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread splashTread = new Thread() {


            @Override

            public void run() {

                try {

                    sleep(3000);

                    startActivity(new Intent(getApplicationContext(), MainActivity.class));

                    finish();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }


                super.run();

            }

        };
        splashTread.start();


    }
}