package com.navigationexperiment.nav;

import android.app.Activity;
import android.content.Intent;

import com.navigationexperiment.MainActivity;
import com.navigationexperiment.next.NextActivity;

public class NavigatorImpl implements Navigator {
    private Activity activity;

    public NavigatorImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void goToNextScreen() {
        Intent intent = new Intent(activity, NextActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void goToMainScreen() {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }
}
