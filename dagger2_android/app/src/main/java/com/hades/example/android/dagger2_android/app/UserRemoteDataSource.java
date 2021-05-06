package com.hades.example.android.dagger2_android.app;

import android.util.Log;

import javax.inject.Inject;

public class UserRemoteDataSource {
    private static final String TAG = "UserRemoteDataSource";

    private final RegisterService registerService;

    @Inject
    public UserRemoteDataSource(RegisterService registerService) {
        this.registerService = registerService;
        Log.d(TAG, "UserRemoteDataSource: registerService@" + this.registerService.hashCode());
    }
}