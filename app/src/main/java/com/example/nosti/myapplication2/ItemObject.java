package com.example.nosti.myapplication2;

import android.graphics.Bitmap;

/**
 * Created by nosti on 2/25/2016.
 */
public class ItemObject {

    private String name;
    private int photo;
    private int resourceId;
    Bitmap thumbnail;

    public ItemObject(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
