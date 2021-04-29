package com.example.hades.dagger2._11_global_singleton;

import com.example.hades.dagger2._11_global_singleton.modules.AppModule;
import com.example.hades.dagger2._11_global_singleton.modules.ReceiversModule;
import com.example.hades.dagger2._11_global_singleton.modules.UtilsModules;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, UtilsModules.class, ReceiversModule.class})
public interface AppComponent {
    void inject(App app);

    void inject(MainActivity mainActivity);
}