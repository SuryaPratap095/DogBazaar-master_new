package com.example.suryasolanki.dogbazaar;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by surya.solanki on 6/10/2016.
 */
public class AnimalListAdapter extends BaseAdapter {
    private Context aContext;
    private int[] ImageId;
    private String[] AnimalName;
    private int ImageNext;
    private int Price[];

    public AnimalListAdapter(Context aContext, int[] imageId, String[] animalName,int[] price,int imageNext) {
        this.aContext = aContext;
        ImageId = imageId;
        AnimalName = animalName;
        Price=price;
        ImageNext=imageNext;
    }


    @Override
    public int getCount() {
        return AnimalName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater)aContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View animalRow =inflater.inflate(R.layout.custom_animal_list,null,true);

        TextView txtName=(TextView) animalRow.findViewById(R.id.txtName);
        TextView txtPrice=(TextView) animalRow.findViewById(R.id.txtPrice);
        ImageView imageAnimal=(ImageView) animalRow.findViewById(R.id.imageAnimal);
        ImageView imageNext=(ImageView) animalRow.findViewById(R.id.imageNext);

        txtName.setText(AnimalName[position]);
        imageAnimal.setImageResource(ImageId[position]);
        txtPrice.setText(Integer.toString((Price[position])));
        imageNext.setImageResource(ImageNext);

        return animalRow;
    }
}
