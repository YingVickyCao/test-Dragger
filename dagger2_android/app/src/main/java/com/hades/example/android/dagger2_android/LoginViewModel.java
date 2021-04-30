package com.hades.example.android.dagger2_android;

import android.util.Log;

import javax.inject.Inject;

public class LoginViewModel {
    private static final String TAG = "LoginViewModel";
    private final UserRepository userRepository;

    // @Inject tells Dagger how to create instances of LoginViewModel
    @Inject
    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;

        Log.d(TAG, "onCreate: userRepository4@" + userRepository.hashCode());
    }
}
