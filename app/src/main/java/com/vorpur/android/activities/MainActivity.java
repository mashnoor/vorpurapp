package com.vorpur.android.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.vorpur.android.R;
import com.vorpur.android.adapters.BrandAdapter;
import com.vorpur.android.constants.URLS;
import com.vorpur.android.models.Brand;
import com.vorpur.android.utils.Loader;

import org.lucasr.twowayview.TwoWayView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.msebera.android.httpclient.Header;

public class MainActivity extends Activity {



   @BindView(R.id.brandsList) TwoWayView brandsView;
    @BindView(R.id.catagoryList) TwoWayView catagoryView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);


        Loader.loadAllBrands(this, brandsView); //Show Brands Horizontal List
        Loader.loadAllCatagories(MainActivity.this, catagoryView); //Show All Catagory List
        //loadAllBrands();

    }











}
