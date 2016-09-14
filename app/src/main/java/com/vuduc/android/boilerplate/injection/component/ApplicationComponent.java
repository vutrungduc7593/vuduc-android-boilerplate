package com.vuduc.android.boilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.vuduc.android.boilerplate.data.DataManager;
import com.vuduc.android.boilerplate.data.SyncService;
import com.vuduc.android.boilerplate.data.local.DatabaseHelper;
import com.vuduc.android.boilerplate.data.local.PreferencesHelper;
import com.vuduc.android.boilerplate.data.remote.RibotsService;
import com.vuduc.android.boilerplate.injection.ApplicationContext;
import com.vuduc.android.boilerplate.injection.module.ApplicationModule;
import com.vuduc.android.boilerplate.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
