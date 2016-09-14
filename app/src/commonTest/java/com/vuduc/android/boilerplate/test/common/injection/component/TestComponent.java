package com.vuduc.android.boilerplate.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.vuduc.android.boilerplate.injection.component.ApplicationComponent;
import com.vuduc.android.boilerplate.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
