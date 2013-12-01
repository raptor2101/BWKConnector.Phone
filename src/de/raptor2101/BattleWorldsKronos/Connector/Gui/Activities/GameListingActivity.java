package de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities;

import android.os.Bundle;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;


public class GameListingActivity extends ActionBarGameListingActivity  {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    this.setTitle(R.string.title_activity_games);
    super.onCreate(savedInstanceState);
  }
}
