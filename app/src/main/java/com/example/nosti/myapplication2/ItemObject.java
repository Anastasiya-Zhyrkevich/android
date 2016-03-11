package com.example.nosti.myapplication2;

import android.graphics.Bitmap;

/**
 * Created by nosti on 2/25/2016.
 */
public class ItemObject {

    private String name;
    private int resourceId;
    Bitmap thumbnail;

    public ItemObject(String name, int resourceId, Bitmap thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public Bitmap getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Bitmap thumbnail) {
        this.thumbnail = thumbnail;
    }
}
