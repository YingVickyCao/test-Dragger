package com.hades.example.android.dagger2_android.app;

import com.hades.example.android.dagger2_android.Stu;
import com.hades.example.android.dagger2_android.login.LoginComponent;
import com.hades.example.android.dagger2_android.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, LoginModule.class})
public interface AppComponent {
    UserRepository userRepository();

    Stu userInfo();

    void inject(App app);

    LoginComponent.Builder loginComponent();
}
