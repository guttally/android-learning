package net.guttally.dagger_viewmodel;

import android.app.Application;

import net.guttally.dagger_viewmodel.di.DaggerAppComponent;

import javax.inject.Inject;

public class App extends Application {
    @Inject String testString;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);
    }
}
