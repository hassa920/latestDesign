package com.example.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class gridAdapter extends BaseAdapter {
    int image[];


    Context context;

    public gridAdapter(int image[], Context context) {
        this.image = image;

        this.context = context;
    }




    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=   layoutInflater.inflate(R.layout.framlayout,null);
        ImageView imageView=view.findViewById(R.id.iconImage);
        TextView textView=view.findViewById(R.id.textData);
        imageView.setImageResource(image[position]);





        return view;
    }
}
