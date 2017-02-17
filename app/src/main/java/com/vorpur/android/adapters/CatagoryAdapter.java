package com.vorpur.android.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.vorpur.android.R;
import com.vorpur.android.constants.URLS;
import com.vorpur.android.models.Catagory;

/**
 * Created by Mashnoor on 2/13/17.
 */

public class CatagoryAdapter extends BaseAdapter {
    private Context activity;
    private Catagory[] catagories;

    public CatagoryAdapter(Activity activity, Catagory[] catagories) {
        this.activity = activity;
        this.catagories = catagories;
        Log.d("---------", "Executed = " + getCount());
    }

    @Override
    public int getCount() {
        return catagories.length;
    }

    @Override
    public Catagory getItem(int position) {
        return catagories[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("---------", "getView: called ");
        View v = convertView;
        if(v==null)
        {
            LayoutInflater inflater = (LayoutInflater)  activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.catagory_card_view, null);
        }

        ImageView catagoryImage = (ImageView) v.findViewById(R.id.catagoryImage);
        TextView catagoryName = (TextView) v.findViewById(R.id.catagoryName);
        Catagory curr = getItem(position);
        catagoryName.setText(curr.getName());
        Log.d("--------", curr.getName());
        Glide.with(activity).load(URLS.CATAGORY_IMAGE + curr.getLogo_url()).into(catagoryImage);



        return v;
    }
}
