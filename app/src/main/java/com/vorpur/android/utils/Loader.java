package com.vorpur.android.utils;

import android.app.Activity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import com.vorpur.android.adapters.BrandAdapter;
import com.vorpur.android.adapters.CatagoryAdapter;
import com.vorpur.android.constants.URLS;
import com.vorpur.android.models.Brand;
import com.vorpur.android.models.Catagory;

import org.lucasr.twowayview.TwoWayView;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Mashnoor on 2/14/17.
 */

public class Loader {

    private static Brand[] brands;
    private static Catagory[] catagories;
    public static  void loadAllBrands(final Activity activity, final TwoWayView brandsView) {

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
                brandsView.setAdapter(new BrandAdapter(activity, brands));

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {

            }

            @Override
            public void onRetry(int retryNo) {

            }
        });
    }



    //Catagory Loaders
    public static  void loadAllCatagories(final Activity activity, final TwoWayView catagoriesView) {


        AsyncHttpClient client = new AsyncHttpClient();
        client.get(URLS.GET_ALL_CATAGORIES, new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                String responseString = new String(response);
                Gson brandsGson = new GsonBuilder().create();
                Log.d("----------", responseString);
                catagories = brandsGson.fromJson(responseString, Catagory[].class);
                catagoriesView.setAdapter(new CatagoryAdapter(activity, catagories));
                Log.d("----------", catagories[0].getName());
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
