package com.vorpur.android.models;

import android.util.Log;

import com.vorpur.android.constants.URLS;

/**
 * Created by Mashnoor on 3/31/17.
 */

public class Product {
    private String id;
    private String name;
    private String price;
    private String catagory;
    private String subcatagory;
    private String brand_id;
    private String size;
    private String description;
    private String logo_url;
    private String created_at;
    private String updated_at;
    private String discount_time_frame;
    private String logos[];

    public Product(String id, String name, String price, String catagory, String subcatagory, String brand_id, String size, String description, String logo_url, String created_at, String updated_at, String discount_time_frame) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.catagory = catagory;
        this.subcatagory = subcatagory;
        this.brand_id = brand_id;
        this.size = size;
        this.description = description;
        this.logo_url = logo_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.discount_time_frame = discount_time_frame;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getSubcatagory() {
        return subcatagory;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getDiscount_time_frame() {
        return discount_time_frame;
    }

    public String getDefaultImageUrl()
    {
        this.logos = logo_url.split(",");
        Log.d("--------", "Logo_url - " + logo_url);
        Log.d("--------", "logos = " + logos[0]);
        return URLS.PRODUCT_IMAGE + logos[0];
    }
}
