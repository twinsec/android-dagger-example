package com.github.twinsec.daggerexample.dagger;

import android.app.Activity;

import com.github.twinsec.daggerexample.MainActivity;

import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface MainActivitySubomponent {
    @Subcomponent.Builder
    interface Builder {
        //@BindsInstance
        //Builder activity(Activity activity);

        MainActivitySubomponent build();
    }

    MainActivity inject(MainActivity activity);
}