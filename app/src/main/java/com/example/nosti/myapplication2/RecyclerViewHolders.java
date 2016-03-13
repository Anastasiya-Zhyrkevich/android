package com.example.nosti.myapplication2;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by nosti on 2/24/2016.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView myPhoto;

    private final Context context;

    private static final String PACKAGE = "com.example.nosti.myapplication2";
    boolean newApi = true;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        context = itemView.getContext();
        itemView.setOnClickListener(this);
        myPhoto = (ImageView)itemView.findViewById(R.id.my_photo);
    }

    @Override
    public void onClick(View view) {
        Log.d("onClickHolder", "onClick " + getPosition());

       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && newApi) {
            Log.d("GoodApi", "1");
            ItemObject info = (ItemObject) view.getTag();
            Intent subActivity = new Intent(context,
                    PictureDetailsActivity2.class);
            Log.d("GoodApi", "Intent Created");
            subActivity.putExtra(PACKAGE + ".resourceId", info.getResourceId());
            ((Activity)context).startActivity(subActivity,
                    ActivityOptions.makeSceneTransitionAnimation((Activity) view.getContext(),
                            view.findViewById(R.id.my_photo), "image").toBundle());
            Log.d("GoodApi", "start Created");
        } else {
            // Interesting data to pass across are the thumbnail size/location, the
            // resourceId of the source bitmap, the picture description, and the
            // orientation (to avoid returning back to an obsolete configuration if
            // the device rotates again in the meantime)
            Log.d("BadApi", "1");
            int[] screenLocation = new int[2];
            view.getLocationOnScreen(screenLocation);
            ItemObject info = (ItemObject) view.getTag();
            Intent subActivity = new Intent(context,
                    PictureDetailsActivity.class);
            Log.d("BadApi", "Intent Created");
            int orientation = context.getResources().getConfiguration().orientation;
            subActivity.
                    putExtra(PACKAGE + ".orientation", orientation).
                    putExtra(PACKAGE + ".resourceId", info.getResourceId()).
                    putExtra(PACKAGE + ".left", screenLocation[0]).
                    putExtra(PACKAGE + ".top", screenLocation[1]).
                    putExtra(PACKAGE + ".width", view.getWidth()).
                    putExtra(PACKAGE + ".height", view.getHeight()).
                    putExtra(PACKAGE + ".description", info.getName());
            Log.d("BadApi", "subAct");
            ((Activity)context).startActivity(subActivity);
            Log.d("BadApi", "SubAct Created");
            // Override transitions: we don't want the normal window animation in addition
            // to our custom one
            //overridePendingTransition(0, 0);
        }
        */


    }
}
