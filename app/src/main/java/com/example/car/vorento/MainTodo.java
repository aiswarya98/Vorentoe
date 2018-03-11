package com.example.car.vorento;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainTodo extends AppCompatActivity {
        Button saveT;
        EditText editText2;
        String Filename="myFile2";
        String name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_todo);
        saveT = findViewById(R.id.savetodo);
        //read = findViewById(R.id.readdiary);
        editText2=findViewById(R.id.todomatter);
        saveT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              saveTT();
            }
        });
    }
    private void saveTT()
    {
        try{
            FileOutputStream fos =openFileOutput(Filename, Context.MODE_PRIVATE);
            name2=editText2.getText().toString();
            fos.write(name2.getBytes());
            fos.close();
            Toast.makeText(this, "Data is saved", Toast.LENGTH_SHORT).show();
        }
        catch (java.io.IOException e){e.printStackTrace();}
    }
}
