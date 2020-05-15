package com.example.coronamehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
 private int progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash_screen);

        progressBar=findViewById(R.id.progressbar);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();



    }
    public void doWork(){
        for(progressbar=25; progressbar<=100; progressbar=progressbar+25 ){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progressbar);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void startApp(){
        Intent intent=new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
    }
}
