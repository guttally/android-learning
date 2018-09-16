package net.guttally.dagger_viewmodel.di;

import net.guttally.dagger_viewmodel.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        MainActivityModule.class,
})
public interface AppComponent {
    void inject(App app);
}
