package com.vuduc.android.boilerplate.injection.component;

import dagger.Subcomponent;
import com.vuduc.android.boilerplate.injection.PerActivity;
import com.vuduc.android.boilerplate.injection.module.ActivityModule;
import com.vuduc.android.boilerplate.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
