package com.example.car.vorento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AishMenu extends AppCompatActivity {
    ImageButton im1,im2,im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aish_menu);
        im1=findViewById(R.id.question);
        im2=findViewById(R.id.todo);
        im3=findViewById(R.id.newseeds);
        im4=findViewById(R.id.abt);
        im1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent1=new Intent(AishMenu.this,askme.class);
                                         startActivity(intent1);
                                   }
                               });
                im2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               Intent intent2=new Intent(AishMenu.this,MainTodo.class);
                                               startActivity(intent2);
                                           }
                                       });
                        im3.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       Intent intent3=new Intent(AishMenu.this,MainNews.class);
                                                       startActivity(intent3);
                                                   }
                                               });
                                im4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent4=new Intent(AishMenu.this,MainAboutus.class);
                                        startActivity(intent4);
                                    }
                                });
    }
}
