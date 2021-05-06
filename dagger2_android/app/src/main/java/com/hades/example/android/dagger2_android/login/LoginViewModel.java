package com.hades.example.android.dagger2_android.login;

import android.util.Log;

import com.hades.example.android.dagger2_android.app.UserRepository;

import javax.inject.Inject;

@ActivityScope
public class LoginViewModel {
    private static final String TAG = "LoginViewModel";

    private final UserRepository userRepository4;

    @Inject
    public LoginViewModel(UserRepository userRepository) {
        this.userRepository4 = userRepository;

        Log.d(TAG, "onCreate: userRepository4@" + userRepository4.hashCode());
    }
}
