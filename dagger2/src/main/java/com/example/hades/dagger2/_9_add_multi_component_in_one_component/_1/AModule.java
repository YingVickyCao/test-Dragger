package com.example.hades.dagger2._9_add_multi_component_in_one_component._1;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {

    @Provides
    public A provideA() {
        return new A();
    }
}