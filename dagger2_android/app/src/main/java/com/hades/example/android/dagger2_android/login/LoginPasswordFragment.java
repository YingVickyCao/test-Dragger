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

public class LoginPasswordFragment extends Fragment {
    private static final String TAG = "LoginPasswordFragment";

    @Inject
    UserRepository userRepository6;

    @Inject
    LoginViewModel loginViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((LoginActivity) getActivity()).loginComponent.inject(this);
        Log.d(TAG, "onCreate: LoginPasswordFragment@" + this.hashCode());
        Log.d(TAG, "onCreate: userRepository6@" + userRepository6.hashCode());
        Log.d(TAG, "onCreate: loginViewModel@" + loginViewModel.hashCode());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_password, container, false);
    }
}
