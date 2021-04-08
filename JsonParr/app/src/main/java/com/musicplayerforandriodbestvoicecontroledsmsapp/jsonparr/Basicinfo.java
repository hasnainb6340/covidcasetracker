package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Basicinfo extends AppCompatActivity {
TextView text,mrq,mrq1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicinfo);
        text=findViewById(R.id.textdata);
        mrq=findViewById(R.id.txtmrq);
        mrq1=findViewById(R.id.txtmrq1);
        text.setText(Html.fromHtml("<b><center>General information</></b>"+"\n"+"1)There is no vaccine of corana virus so only to remain safe is prevention"+"\n"+
        "2)Stay  Home, your home is the safesst place for you"+"\n"+"The new coronavirus is a respiratory virus which spreads primarily through droplets generated when an infected person coughs or sneezes, or through droplets of saliva or discharge from the nose. "+"\n"+"To protect yourself, clean your hands frequently with an alcohol-based hand rub or wash them with soap and water."+"\n"+"" +
               "\n"+ "<b><center>Common questions</></>"+"\n"+"\n"+"Q1):-Can the coronavirus disease spread through air?"+"\n"+
                "The virus that causes COVID-19 is mainly transmitted through droplets generated when an infected person coughs, sneezes, or speaks. These droplets are too heavy to hang in the air. They quickly fall on floors or surfaces. You can be infected by breathing in the virus if you are within 1 metre of a person who has COVID-19, or by touching a contaminated surface and then touching your eyes, nose or mouth before washing your hands."+"\n"+"" +
                "Q2)What is the incubation period of the coronavirus disease?"+"\n"+"The “incubation period” means the time between catching the virus and beginning to have symptoms of the disease. Most estimates of the incubation period for COVID-19 range from 1-14 days, most commonly around five days. These estimates will be updated as more data become available."+"\n"
        +"Q3)How can you prevent the spread of the coronavirus disease?"+"\n"+"Standard recommendations to prevent the spread of COVID-19 include frequent cleaning of hands using alcohol-based hand rub or soap and water; covering the nose and mouth with a flexed elbow or disposable tissue when coughing and sneezing; and avoiding close contact with anyone that has a fever and cough."+"\n"+"Q4)What happens when you get the coronavirus disease?"+"\n"+
                "People with COVID-19 generally develop signs and symptoms, including mild respiratory symptoms and fever, on an average of 5-6 days after infection (mean incubation period 5-6 days, range 1-14 days). Most people infected with COVID-19 virus have mild disease and recover."+"\n"+"Q5)What is the treatment for the coronavirus disease?"+"\n"+"There is no specific treatment for disease caused by a novel coronavirus. However, many of the symptoms can be treated and therefore treatment based on the patient's clinical condition."));
mrq.setText("Stay home.Stay safe"+" "+"Your home is the safest place for you");
    mrq1.setText("Salute to all the doctors."+" "+"Everyone is proud of you");
    }
}
