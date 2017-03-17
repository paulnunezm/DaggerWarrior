package com.nunez.daggerexample;

import javax.inject.Inject;

/**
 * Created by paulnunez on 3/16/17.
 */

public class RogueWarrior implements Warrior{

  private Weapon weapon;

  @Inject
  public RogueWarrior(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public String useWeapon() {
    return weapon.hit();
  }
}
