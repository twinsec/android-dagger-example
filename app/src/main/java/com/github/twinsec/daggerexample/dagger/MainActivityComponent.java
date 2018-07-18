package com.github.twinsec.daggerexample.dagger;

import com.github.twinsec.daggerexample.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface MainActivityComponent {
    MainActivity inject(MainActivity activity);
}