package com.vorpur.android.models;

/**
 * Created by Mashnoor on 2/13/17.
 */

public class Catagory {
    private int id;
    private String name;
    private String logo_url;
    private String created_at;
    private String updated_at;

    public Catagory(int id, String name, String logo_url, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.logo_url = logo_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
}
