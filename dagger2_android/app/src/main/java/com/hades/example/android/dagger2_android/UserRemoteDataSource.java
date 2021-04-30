package com.hades.example.android.dagger2_android;

import javax.inject.Inject;

public class UserRemoteDataSource {
    private final LoginRetrofitService loginRetrofitService;

    @Inject
    public UserRemoteDataSource(LoginRetrofitService loginRetrofitService) {
        this.loginRetrofitService = loginRetrofitService;
    }
}
