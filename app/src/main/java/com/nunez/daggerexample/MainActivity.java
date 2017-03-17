package com.nunez.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject
  RogueWarrior warrior; // also injects his own dependencies

//  private GameComponent gameComponent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

//    gameComponent = DaggerGameComponent
//        .builder()
//        .gameModule(new GameModule())
//        .build();

//    gameComponent.inject(this);

    ((DaggerApplication) getApplication()).getGameComponet().inject(this);

    ((TextView) findViewById(R.id.text)).setText(warrior.useWeapon());

  }

}
