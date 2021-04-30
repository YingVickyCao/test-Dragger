package com.hades.example.android.dagger2_android;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;


public class App extends Application {
    private static final String TAG = "App";
    AppComponent appComponent;
    @Inject
    UserRepository userRepository3;

    @Override
    public void onCreate() {
        super.onCreate();

        // Create an instance of the application graph
//        AppComponent appComponent = DaggerAppComponent.create();
        appComponent = DaggerAppComponent.create();
        // appComponent@247260447
        Log.d(TAG, "onCreate: appComponent@" + appComponent.hashCode());


// Grab an instance of UserRepository from the application graph
        UserRepository userRepository = appComponent.userRepository();
        UserRepository userRepository2 = appComponent.userRepository();

        Log.d(TAG, "onCreate: userRepository@" + userRepository.hashCode());
        Log.d(TAG, "onCreate: userRepository2@" + userRepository2.hashCode());
//        Log.d(TAG, "onCreate: userRepository3@" + userRepository3.hashCode());

        Stu stu = appComponent.userInfo();
        Stu stu2 = appComponent.userInfo();
        Log.d(TAG, "onCreate: userInfo@" + stu.hashCode());
        Log.d(TAG, "onCreate: userInfo2@" + stu2.hashCode());
    }

    public AppComponent appComponent() {
//        AppComponent appComponent = DaggerAppComponent.create();
        // appComponent2@47224041
        Log.d(TAG, "onCreate: appComponent2@" + appComponent.hashCode());

        return appComponent;
    }

}
