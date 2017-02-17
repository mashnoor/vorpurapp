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
import com.vorpur.android.models.Brand;
import com.vorpur.android.models.Catagory;

import static java.security.AccessController.getContext;

/**
 * Created by Mashnoor on 2/12/17.
 */
public class BrandAdapter extends BaseAdapter
{
     private Context activity;
    private Brand[] brands;

    public BrandAdapter(Context activity, Brand[] brands) {
        this.activity = activity;
        this.brands = brands;
    }

    @Override
    public int getCount() {
        return brands.length;
    }

    @Override
    public Brand getItem(int position) {
        return brands[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater)  activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.brand_look_like, null);
        }

        TextView t = (TextView) convertView.findViewById(R.id.mytext);
        if(t==null)
        {
            Log.d("--------", "Text nukk");
        }

        ImageView brandImage = (ImageView) convertView.findViewById(R.id.brandImage);

        Brand curr = getItem(position);


        Glide.with(activity).load(URLS.BRAND_IMAGE + curr.getLogo_url()).into(brandImage);



        return convertView;
    }

}