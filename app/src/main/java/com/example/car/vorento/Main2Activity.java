package com.example.car.vorento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
ImageView loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        loading=findViewById(R.id.rotate);
        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplication(), R.anim.rotateclock);
        loading.startAnimation(animation);
        Thread splashThread= new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    int wait=0;
                    while(wait<3000)
                    {
                        sleep(100);
                        wait+=100;
                    }
                } catch (InterruptedException e) {

                }finally {
                    finish();
                    Intent iintent =new Intent(Main2Activity.this,Diary.class);
                    startActivity(iintent);
                }
            }
        };
        splashThread.start();
    }

}
