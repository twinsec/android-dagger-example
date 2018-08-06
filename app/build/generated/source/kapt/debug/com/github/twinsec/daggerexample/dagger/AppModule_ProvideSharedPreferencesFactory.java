// Generated by Dagger (https://google.github.io/dagger).
package com.github.twinsec.daggerexample.dagger;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideSharedPreferencesFactory(
      AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module, appProvider);
  }

  public static SharedPreferences provideInstance(
      AppModule module, Provider<Application> appProvider) {
    return proxyProvideSharedPreferences(module, appProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      AppModule module, Provider<Application> appProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(module, appProvider);
  }

  public static SharedPreferences proxyProvideSharedPreferences(
      AppModule instance, Application app) {
    return Preconditions.checkNotNull(
        instance.provideSharedPreferences(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}