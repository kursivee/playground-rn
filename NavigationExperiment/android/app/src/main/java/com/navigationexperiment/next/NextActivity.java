package com.navigationexperiment.next;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.navigationexperiment.MainActivity;
import com.navigationexperiment.MainApplication;
import com.navigationexperiment.R;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Activity activity = this;

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WritableMap event = Arguments.createMap();
                event.putString("NAVIGATION", "NEXT_SCREEN");
                ReactContext context = ((MainApplication) getApplication()).getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
                context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("NAVIGATION", event);
            }
        });
    }
}
