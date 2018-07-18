package com.github.twinsec.daggerexample;

import javax.inject.Inject;

import android.app.Activity;
import android.app.Application;

import com.github.twinsec.daggerexample.dagger.AppComponent;
import com.github.twinsec.daggerexample.dagger.AppModule;
import com.github.twinsec.daggerexample.dagger.DaggerAppComponent;
import com.github.twinsec.daggerexample.dagger.NetworkModule;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {
    private AppComponent appComponent;

    @Inject
    DispatchingAndroidInjector<Activity> androidInjector;

    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule("https://api.example.com"))
                .build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return androidInjector;
    }
}