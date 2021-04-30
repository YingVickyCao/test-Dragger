package com.hades.example.android.dagger2_android;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
// @Component makes Dagger create a graph of dependencies
@Component(modules = NetworkModule.class)
public interface AppComponent {
    // The return type  of functions inside the component interface is
    // what can be consumed from the graph
    UserRepository userRepository();

    Stu userInfo();

    void inject(LoginActivity loginActivity);
}
