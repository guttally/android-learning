package net.guttally.dagger_viewmodel.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @Singleton
    public String provideTestString() {
        return new String("AppModule");
    }
}
