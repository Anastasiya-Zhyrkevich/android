package com.example.nosti.myapplication2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by nosti on 2/24/2016.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView myPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        myPhoto = (ImageView)itemView.findViewById(R.id.my_photo);
    }

    @Override
    public void onClick(View view) {

    }
}
