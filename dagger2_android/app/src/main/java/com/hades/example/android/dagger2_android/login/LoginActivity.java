package com.hades.example.android.dagger2_android.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.hades.example.android.dagger2_android.app.App;
import com.hades.example.android.dagger2_android.main.MainActivity;
import com.hades.example.android.dagger2_android.R;
import com.hades.example.android.dagger2_android.app.UserRepository;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    @Inject
    UserRepository userRepository5;

    @Inject
    LoginViewModel loginViewModel;
    LoginComponent loginComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        loginComponent = ((App) getApplicationContext()).appComponent().loginComponent().build();
        loginComponent.inject(this);

        Log.d(TAG, "onCreate: LoginActivity@" + this.hashCode());
        Log.d(TAG, "onCreate: userRepository5@" + userRepository5.hashCode());

        findViewById(R.id.password).setOnClickListener(v -> password());
        findViewById(R.id.main).setOnClickListener(v -> main());
        findViewById(R.id.userName).setOnClickListener(v -> userName());
    }

    private void password() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentRoot, new LoginPasswordFragment()).commit();
    }

    private void main() {
        startActivity(new Intent(this, MainActivity.class));
    }

    private void userName() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentRoot, new LoginUsernameFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragmentRoot);
        if (null != fragment) {
            getSupportFragmentManager().beginTransaction().remove(fragment);
        }
    }
}
