package com.example.nosti.myapplication2;

import android.graphics.Bitmap;

/**
 * Created by nosti on 2/25/2016.
 */
public class ItemObject {

    private String name;
    //private int photo;
    private int resourceId;
    private Bitmap thumbnail;

    public ItemObject(int resourceId, String name, Bitmap thumbnail) {
        this.name = name;
        //this.photo = photo;
        this.resourceId = resourceId;
        this.thumbnail = thumbnail;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*public int getPhoto() {  return photo;  } */

    /* public void setPhoto(int photo) {  this.photo = photo;   } */
}
