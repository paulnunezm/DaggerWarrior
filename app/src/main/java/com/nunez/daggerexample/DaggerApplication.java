package com.nunez.daggerexample;

import android.app.Application;

/**
 * Created by paulnunez on 3/16/17.
 */

public class DaggerApplication extends Application {

  GameComponent gameComponent;
  @Override
  public void onCreate() {
    super.onCreate();

    gameComponent = DaggerGameComponent
        .builder()
        .build();
  }

  public GameComponent getGameComponet(){
    return gameComponent;
  }
}
