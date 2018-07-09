package com.doctor_locator.himel.doctor_locator.app;

import android.app.Application;

import com.google.firebase.messaging.FirebaseMessaging;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseMessaging.getInstance().subscribeToTopic("storelocatornotification");

    }
}
