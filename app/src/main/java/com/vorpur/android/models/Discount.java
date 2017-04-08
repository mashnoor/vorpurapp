package com.vorpur.android.models;

/**
 * Created by Mashnoor on 4/2/17.
 */

public class Discount {
    private String id;
    private String logo_url;
    private String related_id;
    private String created_at;
    private String updated_at;

    public Discount(String id, String logo_url, String related_id, String created_at, String updated_at) {
        this.id = id;
        this.logo_url = logo_url;
        this.related_id = related_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public String getRelated_id() {
        return related_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
