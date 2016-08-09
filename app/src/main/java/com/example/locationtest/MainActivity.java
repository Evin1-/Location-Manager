package com.example.locationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    private LocationHelper mLocationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationHelper = new LocationHelper(getApplicationContext());

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mLocationHelper != null) {
            mLocationHelper.requestUpdates();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mLocationHelper !=null){
            mLocationHelper.stopUpdates();
        }
    }
}
