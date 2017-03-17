package com.nunez.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by paulnunez on 3/16/17.
 */
@Singleton
@Component(modules = GameModule.class)
public interface GameComponent {
  void inject(MainActivity mainActivity);
}
