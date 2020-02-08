package com.navigationexperiment.nav;

import android.app.Activity;

public interface Navigator {
    void setActivity(Activity activity);
    void goToNextScreen();
}
