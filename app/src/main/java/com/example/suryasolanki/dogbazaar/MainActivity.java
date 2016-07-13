package com.example.suryasolanki.dogbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridHome;
    String[] breeds={
            "Dogs",
            "Cats",
            "Birds",
            "Accessories",
            "Gallery",
            "Contact Us"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridAdapter gridAdapter=new GridAdapter(MainActivity.this,breeds);
        gridHome=(GridView)findViewById(R.id.home_grid);
        gridHome.setAdapter(gridAdapter);
      /*  gridHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"You clicked At"+breeds[+position],Toast.LENGTH_SHORT).show();
            }
        });*/

    }



}
