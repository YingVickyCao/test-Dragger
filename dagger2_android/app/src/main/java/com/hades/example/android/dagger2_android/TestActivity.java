package com.hades.example.android.dagger2_android;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.android.dagger2_android.login.LoginActivity;

public class TestActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);


        findViewById(R.id.login).setOnClickListener(v -> login());
    }

    private void login() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
