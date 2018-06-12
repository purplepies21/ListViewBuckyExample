package com.example.ash.listviewbuckyexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row,parent, false);

        String singleFoodItem=getItem(position);
        TextView buckyText= (TextView) customView.findViewById(R.id.buckysText);
        ImageView buckysImage= (ImageView) customView.findViewById(R.id.buckysImage);
        buckyText.setText(singleFoodItem);
        buckysImage.setImageResource(R.drawable.ic_launcher_foreground);
        return customView;
    }
}
