package com.example.dalila.daggerdemo.di.auth;

import com.example.dalila.daggerdemo.di.ViewModelKey;
import com.example.dalila.daggerdemo.ui.auth.AuthViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindViewModel(AuthViewModel viewModel);
}
