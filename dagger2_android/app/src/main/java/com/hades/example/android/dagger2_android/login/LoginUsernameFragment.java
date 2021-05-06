package com.hades.example.android.dagger2_android.login;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hades.example.android.dagger2_android.R;
import com.hades.example.android.dagger2_android.app.UserRepository;

import javax.inject.Inject;

public class LoginUsernameFragment extends Fragment {
    private static final String TAG = "LoginUsernameFragment";

    @Inject
    UserRepository userRepository7;

    @Inject
    LoginViewModel loginViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((LoginActivity) getActivity()).loginComponent.inject(this);
        Log.d(TAG, "onCreate: LoginUsernameFragment@" + this.hashCode());
        Log.d(TAG, "onCreate: userRepository7@" + userRepository7.hashCode());
        Log.d(TAG, "onCreate: loginViewModel@" + loginViewModel.hashCode());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_user_name, container, false);
    }
}
