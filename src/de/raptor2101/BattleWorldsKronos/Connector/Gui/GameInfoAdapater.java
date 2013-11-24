package de.raptor2101.BattleWorldsKronos.Connector.Gui;

import android.content.Context;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.AbstractGameInfoAdapater;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.IGameInfoView;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.Controls.GameInfoView;


public class GameInfoAdapater extends AbstractGameInfoAdapater {

  public GameInfoAdapater(Context context) {
    super(context);
  }

  @Override
  protected IGameInfoView createGameInfoView(Context context) {
    return new GameInfoView(context);
  }
  
  

}
