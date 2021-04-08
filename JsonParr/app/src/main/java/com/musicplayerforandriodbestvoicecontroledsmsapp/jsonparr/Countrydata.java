package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Countrydata extends AppCompatActivity {
Button clickes;
public static TextView txtures;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countrydata);
        clickes=findViewById(R.id.btnrefreshing);
        txtures=findViewById(R.id.txtoutput);
        clickes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               countryrefresh process=new countryrefresh();
                process.execute();
            }
        });
    }
}
