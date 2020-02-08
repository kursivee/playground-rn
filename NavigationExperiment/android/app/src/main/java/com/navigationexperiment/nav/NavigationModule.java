package com.navigationexperiment.nav;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class NavigationModule extends ReactContextBaseJavaModule {

    private Navigator navigation;

    public NavigationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.navigation = new NavigatorImpl(getCurrentActivity());
    }

    @NonNull
    @Override
    public String getName() {
        return "NavigationModule";
    }

    @ReactMethod
    public void goToNextScreen() {
        System.out.println("GO TO NEXT");
        navigation.setActivity(getCurrentActivity());
        navigation.goToNextScreen();
    }

    @ReactMethod
    public void goToMainScreen() {
        navigation.setActivity(getCurrentActivity());
        navigation.goToMainScreen();
    }
}
