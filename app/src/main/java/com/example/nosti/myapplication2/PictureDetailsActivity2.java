package com.example.nosti.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by nosti on 3/1/2016.
 */
public class PictureDetailsActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("PictureDetail", "2");
        setContentView(R.layout.photo_main2);
    }
}
