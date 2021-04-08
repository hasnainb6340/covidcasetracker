package com.musicplayerforandriodbestvoicecontroledsmsapp.jsonparr;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class fetchresult extends AsyncTask {
    String data="";
    String result=" ";
    String dataParsed=" ";
    String singleparsed=" ";
    String singleParsed="";
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            URL url = new URL("https://corona.lmao.ninja/v2/countries/PAK");
            //URL url = new URL("http://api.coronastatistics.live/countries/pakistan");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            JSONObject JO=new JSONObject(data);
            singleParsed = "\n"+"Total PAKistan Cases"+"\n"+
                    "Total cases:" + JO.get("cases") + "\n" +
                    "Total Death:" + JO.get("deaths") + "\n" +
                    "TotalRecovered:" + JO.get("recovered") + "\n"+"active cases"+JO.get("active")+"\n"+"critical cases"+JO.get("critical")+
                    "\n"+"todayCases"+JO.get("todayCases")+"\n"+"todayDeaths"+JO.get("todayDeaths")+"\n"+"casesPerOneMillion"+JO.get("casesPerOneMillion")+"\n"+"deathsPerOneMillion"+JO.get("deathsPerOneMillion");
            singleParsed = "\n"+"Total World Cases"+"\n"+
                    "Total cases:" + JO.get("cases") + "\n" +
                    "Total Death:" + JO.get("deaths") + "\n" +
                    "TotalRecovered:" + JO.get("recovered") + "\n"+"active cases"+JO.get("active")+"\n"+"critical cases"+JO.get("critical")+
                    "\n"+"todayCases"+JO.get("todayCases")+"\n"+"todayDeaths"+JO.get("todayDeaths")+"\n"+"casesPerOneMillion"+JO.get("casesPerOneMillion")+"\n"+"deathsPerOneMillion"+JO.get("deathsPerOneMillion")+"\n"+"tests"+JO.get("tests")+
                    "\n"+"testsPerOneMillion"+JO.get("testsPerOneMillion")+"\n";
            dataParsed = dataParsed + singleParsed + "\n";
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        return null;}
    @Override
    protected void onPostExecute (Object o){
        super.onPostExecute(o);
        World.txture.setText(dataParsed);
    }


}
