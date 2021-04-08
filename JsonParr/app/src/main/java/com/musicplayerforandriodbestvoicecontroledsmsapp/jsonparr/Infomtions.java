package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Infomtions extends AppCompatActivity {
Button stoping,quarnting,coughing,sympst,prevts,infoing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomtions);
        stoping=findViewById(R.id.stoping);
        quarnting=findViewById(R.id.quarnting);
        coughing=findViewById(R.id.coughing);
        sympst=findViewById(R.id.symps);
        prevts=findViewById(R.id.prevs);
        infoing=findViewById(R.id.infoing);
        stoping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Infomtions.this,Stop.class);
                startActivity(it);
            }
        });
        quarnting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Infomtions.this,Information.class);
                startActivity(it);
            }
        });
        coughing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Infomtions.this,Cough.class);
                startActivity(it);
            }
        });
        sympst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Infomtions.this,symptoms.class);
                startActivity(it);
            }
        });
        prevts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Infomtions.this,Preventions.class);
                startActivity(it);
            }
        });
        infoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Infomtions.this,Basicinfo.class);
                startActivity(it);
            }
        });
    }
}
