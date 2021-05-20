package com.example.dalila.daggerdemo.di;

import com.example.dalila.daggerdemo.di.auth.AuthViewModelsModule;
import com.example.dalila.daggerdemo.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class})
    abstract AuthActivity contributeAuthActivity();

}
