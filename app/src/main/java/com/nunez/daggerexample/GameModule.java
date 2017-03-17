package com.nunez.daggerexample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paulnunez on 3/16/17.
 */

@Module
public class GameModule {

  @Provides
  Weapon provideWeapon(){
    return new DaggerWeapon();
  }

  @Provides
  Warrior provideWarrior(RogueWarrior warrior){
    return  warrior;
  }

}
