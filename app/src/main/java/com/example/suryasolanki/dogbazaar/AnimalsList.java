package com.example.suryasolanki.dogbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class AnimalsList extends AppCompatActivity {

    ListView animalList;
    int ImageNext=R.mipmap.arrow;
    String[] AnimalName={
            "Afghan Shepherd",
            "Akita Inu",
            "Alaskan Klee Kai",
            "American Bulldog",
            "Boxer",
            "Bulldog",
            "Alaskan Klee Kai"
    };
    int Price[]={
            1000,
            2342,
            5345,
            8798,
            4567,
            5687,
            98754
    };

    int[] ImageId={
            R.mipmap.akita,
            R.mipmap.boxer,
            R.mipmap.braque,
            R.mipmap.kukai,
            R.mipmap.racibroz,
            R.mipmap.shepherd,
            R.mipmap.kukai,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_list);
        AnimalListAdapter animalListAdapter=new AnimalListAdapter(this,ImageId,AnimalName,Price,ImageNext);
        animalList=(ListView)findViewById(R.id.listAnimals);
        animalList.setAdapter(animalListAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animals_list, menu);
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
