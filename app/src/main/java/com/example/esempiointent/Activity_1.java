package com.example.esempiointent;


import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import java.time.*; // Import the LocalDateTime class
import java.time.format.*; // Import the DateTimeFormatter class

public class Activity_1 extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        Button btn1=(Button)findViewById(R.id.button1);
        TextView textview=(TextView)findViewById(R.id.textView1);
        EditText edit1=(EditText)findViewById(R.id.editText1);
        btn1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                String data=edit1.getText().toString();
                String data1[];
                String anno = null;
                String mese=null;
                String giorno=null;
                if(data.contains("/")) {
                    data1=data.split("/");
                    giorno=data1[0];
                    mese=data1[1];
                    anno=data1[2];
                }
                LocalDateTime local = LocalDateTime.of(Integer.valueOf(anno),Integer.valueOf(mese),Integer.valueOf(giorno),0,0,0,0);

                LocalDateTime localDateTime1 = local.plusYears(1)
                                        .plusMonths(1)
                                        .plusWeeks(1)
                                        .plusDays(1);
                DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
                String dateTimeString = localDateTime1.format(formatter);

                Toast.makeText(getApplicationContext(),String.valueOf(dateTimeString), Toast.LENGTH_LONG).show();
            }

        });
    }
}
