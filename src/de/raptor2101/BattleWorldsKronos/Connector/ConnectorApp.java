package de.raptor2101.BattleWorldsKronos.Connector;

import android.app.Activity;
import de.raptor2101.BattleWorldsKronos.Connector.AbstractConnectorApp;
import de.raptor2101.BattleWorldsKronos.Connector.NotificationService;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities.GameListingActivity;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities.MessageListingActivity;

public class ConnectorApp extends AbstractConnectorApp{
  
    @Override
    public void onCreate() {
      NotificationService.setResponseActivities(GameListingActivity.class, MessageListingActivity.class);
      super.onCreate();
    }

    @Override
    public Class<? extends Activity> getGameListingActivityClass() {
      // TODO Auto-generated method stub
      return GameListingActivity.class;
    }

    @Override
    public Class<? extends Activity> getMessageListingActivityClass() {
      // TODO Auto-generated method stub
      return MessageListingActivity.class;
    }
}
