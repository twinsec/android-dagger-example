package com.github.twinsec.daggerexample.dagger;

import javax.inject.Singleton;

import android.content.SharedPreferences;

import com.github.twinsec.daggerexample.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import okhttp3.OkHttpClient;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        AndroidInjectionModule.class,
        ActivitiesModule.class
})
public interface AppComponent {
    SharedPreferences sharedPreference();
    OkHttpClient httpClient();
    void inject(App app);

    MainActivitySubomponent.Builder mainActivityComponent();
}