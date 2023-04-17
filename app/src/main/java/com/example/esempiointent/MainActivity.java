package com.example.esempiointent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metodo_di_collegamento_Intent();

    }
    protected void metodo_di_collegamento_Intent(){
        Button btn1=(Button)findViewById(R.id.buttone_01);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View view0){
                Intent activity_1 = new Intent(MainActivity.this, Activity_1.class);
                startActivity(activity_1);
            }
        });
    }
}