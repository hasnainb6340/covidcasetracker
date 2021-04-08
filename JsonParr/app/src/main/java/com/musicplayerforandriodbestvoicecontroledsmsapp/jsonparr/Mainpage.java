package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mainpage extends AppCompatActivity {
ImageButton datas,infom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        datas=findViewById(R.id.data);
        infom=findViewById(R.id.infomationpage);
        datas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Mainpage.this,FirstPage.class);
                startActivity(it);
            }
        });
        infom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Mainpage.this,Infomtions.class);
                startActivity(it);
            }
        });
    }
}
