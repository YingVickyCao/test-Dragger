package com.hades.example.android.dagger2_android.app;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

public class App extends Application {
    private static final String TAG = "App";
    AppComponent appComponent;

    @Inject
    UserRepository userRepository3;

    @Inject
    RegisterService registerService;

    @Override
    public void onCreate() {
        super.onCreate();

//        AppComponent appComponent = DaggerAppComponent.create();
//        appComponent = DaggerAppComponent.create();
        appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);
        // appComponent@247260447
        Log.d(TAG, "onCreate: appComponent@" + appComponent.hashCode());

        UserRepository userRepository = appComponent.userRepository();
        UserRepository userRepository2 = appComponent.userRepository();
        Log.d(TAG, "onCreate: userRepository@" + userRepository.hashCode());
        Log.d(TAG, "onCreate: userRepository2@" + userRepository2.hashCode());
        Log.d(TAG, "onCreate: userRepository3@" + userRepository3.hashCode());

        Log.d(TAG, "onCreate: registerService@" + registerService.hashCode());

//        Stu stu = appComponent.userInfo();
//        Stu stu2 = appComponent.userInfo();
//        Log.d(TAG, "onCreate: userInfo@" + stu.hashCode());
//        Log.d(TAG, "onCreate: userInfo2@" + stu2.hashCode());
    }

    public AppComponent appComponent() {
//        AppComponent appComponent = DaggerAppComponent.create();
        // appComponent2@47224041
        Log.d(TAG, "onCreate: appComponent2@" + appComponent.hashCode());

        return appComponent;
    }

}
