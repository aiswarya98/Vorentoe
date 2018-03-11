package com.example.car.vorento;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Diary extends AppCompatActivity {
    Button next, save, read;
    EditText editText1;
    DatePicker datePicker;
    String FileName="myFile";
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        next = findViewById(R.id.nextAct);
        save = findViewById(R.id.savediary);
        read = findViewById(R.id.readdiary);
        editText1=findViewById(R.id.pagediary);
        datePicker=findViewById(R.id.dtp);
        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), (Calendar.MONTH), (Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth()+"-"+datePicker.getMonth()+
                "-"+datePicker.getYear(),Toast.LENGTH_LONG).show();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(Diary.this, AishMenu.class);
                startActivity(i4);
            }

        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            save();
            }
        });
        read.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            read();
            }
        });
    }
    private void save()
    {
      try{
          FileOutputStream fos =openFileOutput(FileName, Context.MODE_PRIVATE);
          name=editText1.getText().toString();
          fos.write(name.getBytes());
          fos.close();
          Toast.makeText(this, "Data is saved", Toast.LENGTH_SHORT).show();
      }
      catch (java.io.IOException e){e.printStackTrace();}
    }
    private void read()
    {
        try{
            FileInputStream fin =openFileInput(FileName);
            InputStreamReader inputStreamReader =new InputStreamReader(fin);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder=new StringBuilder();
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                stringBuilder.append(line);
            }
            fin.close();
            inputStreamReader.close();
            //readName.setText("NAme"+stringBuilder.toString());
            //Toast.makeText(this, "Data recived ", Toast.LENGTH_SHORT).show();
                    }
        catch (java.io.IOException e){e.printStackTrace();}
    }
}
