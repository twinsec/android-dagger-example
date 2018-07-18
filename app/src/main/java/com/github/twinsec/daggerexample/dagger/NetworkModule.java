package com.github.twinsec.daggerexample.dagger;

import javax.inject.Singleton;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Module
public class NetworkModule {
    private static final int CACHE_SIZE = 10 * 1024 * 1024; // 10 MB

    String mBaseUrl;

    public NetworkModule(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }

    @Provides
    @Singleton
    Cache provideOkHttpCache(Application app) {
        return new Cache(app.getCacheDir(), CACHE_SIZE);
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache) {
        return new OkHttpClient.Builder().cache(cache).build();
    }

    //@Provides
    //@Singleton
    //Gson provideGson() {
    //    GsonBuilder gsonBuilder = new GsonBuilder();
    //    gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
    //    return gsonBuilder.create();
    //}
}