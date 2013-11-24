package de.raptor2101.BattleWorldsKronos.Connector;


import de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities.GameListingActivity;
import android.app.Application;

public class ConnectorApp extends Application {
    @Override
    public void onCreate() {
      NotificationService.setResponseActivities(GameListingActivity.class, null);
      NotificationService.register(this);
      super.onCreate();
    }
}
