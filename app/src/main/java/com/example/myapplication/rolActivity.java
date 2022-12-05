package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rolActivity extends AppCompatActivity implements View.OnClickListener {
    Context contexto1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rol);
        contexto1=getApplicationContext();
        btn1=findViewById(R.id.btnEst);
        btn1.setOnClickListener(informacionActivity);
    }
    @Override
    public void onClick(View view) {
    }
    private View.OnClickListener informacionActivity=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent int3= new Intent(contexto1, informacionActivity.class);
            startActivity(int3);
        }
    };
}