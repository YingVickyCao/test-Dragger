package com.hades.example.android.dagger2_android.main;

import com.hades.example.android.dagger2_android.login.ActivityScope;
import com.hades.example.android.dagger2_android.login.LoginActivity;
import com.hades.example.android.dagger2_android.login.LoginPasswordFragment;
import com.hades.example.android.dagger2_android.login.LoginUsernameFragment;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface OtherPageComponent {
    @Subcomponent.Builder
    interface Builder {
        OtherPageComponent build();
    }

    void inject(OtherPageComponent otherPageComponent);
}