package de.raptor2101.BattleWorldsKronos.Connector.Gui;

import de.raptor2101.BattleWorldsKronos.Connector.Gui.Controls.GameView;
import android.content.Context;


public class GamesAdapater extends AbstractGameViewAdapater {

  public GamesAdapater(Context context) {
    super(context);
  }

  @Override
  protected IGameView createGameView(Context context) {
    return new GameView(context);
  }
  
  

}
