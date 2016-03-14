package com.example.nosti.myapplication2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by nosti on 2/24/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;
    private Resources resources;

    public RecyclerViewAdapter(Context context, BitmapUtils mBitmapUtils) {
        this.context = context;
        this.resources = context.getResources();
        this.itemList = mBitmapUtils.loadThumbnails(this.resources);
        Log.d("Load", "Load");
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        //holder.myPhoto.setImageResource(itemList.get(position).getThumbnail());

        ItemObject pictureData = itemList.get(position);

        BitmapDrawable thumbnailDrawable =
                new BitmapDrawable(resources, pictureData.getThumbnail());
        //thumbnailDrawable.setColorFilter(grayscaleFilter);

        holder.myPhoto.setImageDrawable(thumbnailDrawable);
        //holder.myPhoto.setOnClickListener(thumbnailClickListener);
        holder.myPhoto.setTag(pictureData);

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
