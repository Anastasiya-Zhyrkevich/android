package com.example.nosti.myapplication2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nosti on 2/24/2016.
 */



public class TabFragment1 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_tab1, container, false);
        Context context = rootView.getContext();

        List<ItemObject> rowListItem = getAllItemList();


        RecyclerView rView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(context, 3));

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(context, rowListItem);
        rView.setAdapter(rcAdapter);

        return rootView;
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        for (int i =  0; i<10; i++) {
            allItems.add(new ItemObject("United States", R.mipmap.im_google));
            allItems.add(new ItemObject("Canada", R.mipmap.im_facebook));
            allItems.add(new ItemObject("United Kingdom", R.mipmap.im_yandex));
        }


        return allItems;
    }
}

