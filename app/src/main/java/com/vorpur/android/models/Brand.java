package com.vorpur.android.models;

/**
 * Created by Mashnoor on 11/14/16.
 */

public class Brand {
    int id;
    String name;
    String description;
    String logo_url;
    String value;
    String created_at;
    String updated_at;

    public Brand(int id, String name, String description, String logo_url, String value, String created_at, String updated_at)

    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.logo_url = logo_url;
        this.value = value;
        this.created_at = created_at;
        this.updated_at = updated_at;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public String getValue() {
        return value;
    }
}
