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



   TwoWayView brandsView, catagoryView;
    Brand[] brands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        brandsView = (TwoWayView) findViewById(R.id.brandsList);
       // catagoryView = (TwoWayView) findViewById(R.id.catagoryList);
       // Loader.loadAllBrands(this, brandsView); //Show Brands Horizontal List
        //Loader.loadAllCatagories(MainActivity.this, catagoryView); //Show All Catagory List
        loadAllBrands();

    }

    public  void loadAllBrands() {

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(URLS.GET_ALL_BRANDS, new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                String responseString = new String(response);
                Gson brandsGson = new GsonBuilder().create();
                Log.d("----------", responseString);
                brands = brandsGson.fromJson(responseString, Brand[].class);
                brandsView.setAdapter(new BrandAdapter(MainActivity.this, brands));

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {

            }

            @Override
            public void onRetry(int retryNo) {

            }
        });
    }










}
