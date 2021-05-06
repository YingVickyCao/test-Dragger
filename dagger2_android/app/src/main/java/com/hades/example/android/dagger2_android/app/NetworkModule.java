package com.hades.example.android.dagger2_android.app;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
    @Provides
    public RegisterService provideLoginRetrofitService() {
        return new RegisterService();
    }
}
