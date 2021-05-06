package com.hades.example.android.dagger2_android.login;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface LoginComponent {
    // You also must define a subcomponent factory inside LoginComponent so that ApplicationComponent knows how to create instances of LoginComponent.
    // Factory that is used to create instances of this subcomponent
    @Subcomponent.Builder
    interface Builder {
        LoginComponent build();
    }

    void inject(LoginActivity loginActivity);

    void inject(LoginUsernameFragment loginUsernameFragment);

    void inject(LoginPasswordFragment loginPasswordFragment);
}