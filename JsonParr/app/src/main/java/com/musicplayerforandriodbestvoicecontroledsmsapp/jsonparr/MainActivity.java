package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button click;
public static TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=findViewById(R.id.button);
        txt=findViewById(R.id.textv);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchdata process=new fetchdata();
                process.execute();
            }
        });

    }
}
