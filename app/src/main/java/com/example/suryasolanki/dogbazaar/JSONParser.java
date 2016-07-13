package com.example.suryasolanki.dogbazaar;

import android.net.ConnectivityManager;
import android.support.annotation.NonNull;
import android.util.Pair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by surya.solanki on 6/30/2016.
 */
public class JSONParser {
    static InputStream is=null;
    static JSONObject jobj=null;
    static String json="";

    public JSONParser(){

    }

    public String sendPostRequest(String requestURL, HashMap<String,String> postDataParams ){
        URL url;

        StringBuilder sb= new StringBuilder();
        try{
            url=new URL(requestURL);

            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoInput(true);

            OutputStream os=conn.getOutputStream();

            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

            writer.flush();
            writer.close();
            os.close();

            int responseCode=conn.getResponseCode();

            if(responseCode==HttpURLConnection.HTTP_OK){
                BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                sb=new StringBuilder();
                String response;


                    while (br.readLine()!=null) {
                        response = br.readLine();
                        sb.append(br.readLine());
                    }
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return  sb.toString();
    }

    public String sendGetRequest(String requestURL){
        StringBuilder sb=new StringBuilder();
        try{
            URL url=new URL(requestURL);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String s;
            while(bufferedReader.readLine()!=null){
                s=bufferedReader.readLine();
                sb.append(s+"\n");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return sb.toString();

    }

    public String sendGetRequestParams(String requestURL, String id){
        StringBuilder sb=new StringBuilder();
        try{
            URL url=new URL(requestURL+id);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String s;
            while(bufferedReader.readLine()!=null){
                s=bufferedReader.readLine();
                sb.append(s+"\n");
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

        return sb.toString();
    }

    public String getPostDataString(HashMap<String,String> params)throws UnsupportedEncodingException{
        StringBuilder result=new StringBuilder();
        boolean first=true;
        for(Map.Entry<String,String> entry:params.entrySet()){
            if(first)
                first=false;
            else
                result.append("&");

            result.append(URLEncoder.encode(entry.getKey(),"UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(),"UTF-8"));
        }

        return result.toString();

    }

}
