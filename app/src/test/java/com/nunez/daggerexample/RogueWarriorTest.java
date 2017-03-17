package com.nunez.daggerexample;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static junit.framework.Assert.assertEquals;

/**
 * Created by paulnunez on 3/16/17.
 */
public class RogueWarriorTest {

  @Rule
  public MockitoRule rule = MockitoJUnit.rule();

  @Mock
  Weapon weapon;

  @InjectMocks
  RogueWarrior warrior;

  @Test
  public void shouldPassRogueHitWithDagger(){

    //given
    final String weaponSound = "wata!!";
    Mockito.when(weapon.hit()).thenReturn(weaponSound);

    //then
    assertEquals(weaponSound, warrior.useWeapon());
  }
}