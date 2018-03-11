package com.example.car.vorento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
        TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.aiswarya);
        Thread splashThread= new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    int wait=0;
                    while(wait<1000)
                    {
                        sleep(100);
                        wait+=100;
                    }
                } catch (InterruptedException e) {

                }finally {
                    finish();
                    Intent i=new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(i);
                }
            }
        };
        splashThread.start();
    }

}
