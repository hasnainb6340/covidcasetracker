package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FirstPage extends AppCompatActivity {
ImageView pak,world,Country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        pak=findViewById(R.id.btnpak);
        world=findViewById(R.id.btnworld);
     Country=findViewById(R.id.countrydata);
      Country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FirstPage.this,Countrydata.class);
                startActivity(it);
            }
        });
       world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FirstPage.this,MainActivity.class);
                startActivity(it);
            }
        });

        pak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(FirstPage.this,World.class);
                startActivity(it);
            }
        });

    }
}
