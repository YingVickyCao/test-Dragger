package com.hades.example.android.dagger2_android;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    @Inject
    UserRepository userRepository3;

    @Inject
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ((App) getApplicationContext()).appComponent().inject(this);
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: userRepository3@" + userRepository3.hashCode());
    }
}
