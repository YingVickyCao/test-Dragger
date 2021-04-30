package com.hades.example.android.dagger2_android;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
    @Singleton
    @Provides
    public LoginRetrofitService provideLoginRetrofitService() {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return new LoginRetrofitService();
    }
}
