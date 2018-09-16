package net.guttally.dagger_viewmodel;

import android.app.Activity;
import android.app.Application;

import net.guttally.dagger_viewmodel.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {
    @Inject DispatchingAndroidInjector<Activity> dispatchingActivityInjector;
    @Inject String testString;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
