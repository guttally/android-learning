package net.guttally.dagger_viewmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {
    @Inject String testString;  // this string variable is injected by AppModule

    @Inject
    @Named("MainActivity.testString2")
    String testString2; // this string is injected by MainActivityModule

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
