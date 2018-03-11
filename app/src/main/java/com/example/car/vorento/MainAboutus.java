package com.example.car.vorento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainAboutus extends AppCompatActivity {
        Button aveme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_aboutus);
        aveme=findViewById(R.id.formsave);
        aveme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainAboutus.this, "Options saved...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
