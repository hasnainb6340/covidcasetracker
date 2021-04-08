package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class World extends AppCompatActivity {
    Button clicker;
    public static TextView txture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);
        clicker=findViewById(R.id.btnrefresh);
        txture=findViewById(R.id.txtshow);
        clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchresult process=new fetchresult();
                process.execute();
            }
        });
    }
}
