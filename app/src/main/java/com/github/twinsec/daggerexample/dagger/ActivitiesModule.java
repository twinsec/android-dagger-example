package com.github.twinsec.daggerexample.dagger;

import com.github.twinsec.daggerexample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivitiesModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();
}