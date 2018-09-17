package net.guttally.dagger_viewmodel.di;

import android.app.Activity;

import net.guttally.dagger_viewmodel.MainActivity;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivityComponent.class)
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(
            MainActivityComponent.Builder builder
    );

    @Provides
    @Named("MainActivity.testString2")
    public static String provideTestString2() {
        return new String("MainActivityModule");
    }
}
