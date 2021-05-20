package com.example.dalila.daggerdemo.di;


import android.app.Application;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dalila.daggerdemo.R;

import androidx.core.content.ContextCompat;
import dagger.Module;
import dagger.Provides;

//app-level dependencies
@Module
public class AppModule {


    //we need this dependency to use the Glide library
    @Provides
    RequestOptions provideRequestOptions() {
     return RequestOptions.placeholderOf(R.drawable.white_background)
                            .error(R.drawable.white_background);
    }

    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }
}
