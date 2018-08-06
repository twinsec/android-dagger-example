// Generated by Dagger (https://google.github.io/dagger).
package com.github.twinsec.daggerexample;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<OkHttpClient> httpClientProvider;

  public MainActivity_MembersInjector(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<OkHttpClient> httpClientProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.httpClientProvider = httpClientProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<OkHttpClient> httpClientProvider) {
    return new MainActivity_MembersInjector(sharedPreferencesProvider, httpClientProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectHttpClient(instance, httpClientProvider.get());
  }

  public static void injectSharedPreferences(
      MainActivity instance, SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  public static void injectHttpClient(MainActivity instance, OkHttpClient httpClient) {
    instance.httpClient = httpClient;
  }
}