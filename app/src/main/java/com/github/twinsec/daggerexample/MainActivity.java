package com.github.twinsec.daggerexample;

import javax.inject.Inject;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.twinsec.daggerexample.dagger.DaggerMainActivityComponent;
import com.twinsec.android.daggerexample.R;

import dagger.android.AndroidInjection;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    OkHttpClient httpClient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //DaggerMainActivityComponent.builder()
        //        .appComponent(((App) getApplication()).getAppComponent())
        //        .build()
        //        .inject(this);
        //((App) getApplication()).getAppComponent()
        //        .mainActivityComponent()
        //        .build()
        //        .inject(this);
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }
}