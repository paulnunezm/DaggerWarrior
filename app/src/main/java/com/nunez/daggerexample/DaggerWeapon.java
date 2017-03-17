package com.nunez.daggerexample;

import javax.inject.Inject;

/**
 * Created by paulnunez on 3/16/17.
 */

public class DaggerWeapon implements Weapon {

  private final String hitSound;

  @Inject
  public DaggerWeapon() {
    this.hitSound = "wapish!";
  }

  @Override
  public String Hit() {
    return hitSound;
  }
}
