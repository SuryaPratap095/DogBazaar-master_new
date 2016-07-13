package com.example.suryasolanki.dogbazaar;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class AnimalServiceList extends AppCompatActivity {

    private ProgressDialog pDialog;
    Context context;

    //JSONParser jsonParser=new JSONParser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_service_list);

//        ConnectivityManager Check=(ConnectivityManager)this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        try {
//
//            String link = "http://www.google.com";
//            URL url = new URL(link);
//            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//            conn.connect();
//
//
//            InputStream inputStream=conn.getInputStream();
//            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
//
//            String webPage = "",data="";
//
//
//                while((data =(String)reader.readLine())!=null){
//                    webPage += data + "\n";
//                }
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }


    }


    public String  performPostCall(String requestURL,
                                   HashMap<String, String> postDataParams){

        URL url;
        String response="";
        try{
//            url=new URL()
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal_service_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
