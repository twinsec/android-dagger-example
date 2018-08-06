package com.github.twinsec.daggerexample.dagger;

import android.app.Activity;
import com.github.twinsec.daggerexample.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivitiesModule_ContributeMainActivityInjector.MainActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributeMainActivityInjector {
  private ActivitiesModule_ContributeMainActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
