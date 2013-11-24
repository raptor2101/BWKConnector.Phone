package de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.http.AndroidHttpClient;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import de.raptor2101.BattleWorldsKronos.Connector.ApplicationSettings;
import de.raptor2101.BattleWorldsKronos.Connector.NotificationService;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.NavigationButtonAdapter;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;
import de.raptor2101.BattleWorldsKronos.Connector.JSON.GameInfo;
import de.raptor2101.BattleWorldsKronos.Connector.JSON.GameListing;
import de.raptor2101.BattleWorldsKronos.Connector.Task.GameListingLoaderTask;
import de.raptor2101.BattleWorldsKronos.Connector.Task.GameListingLoaderTask.ResultListener;
import de.raptor2101.BattleWorldsKronos.Connector.ConnectorApp;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.GameInfoAdapater;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.Controls.GameInfoView;

public class GameListingActivity extends AbstractGameListingActivity implements ResultListener, OnItemClickListener {
  private GameInfoAdapater mAdapter = new GameInfoAdapater(this);
  GameInfoView mExpandedView;
  
  public GameListingActivity() {
    super(R.layout.game_listing_activity);
  }

  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        
    ListView listView = (ListView) findViewById(R.id.game_listing);
    listView.setOnItemClickListener(this);
  }

  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    GameInfoView gameInfoView = (GameInfoView) view;
    if(gameInfoView.isExpanded()){
      gameInfoView.collapse();
      mExpandedView = null;
    } else{
      if(mExpandedView != null){
        mExpandedView.collapse();
      }
      gameInfoView.expand();
      mExpandedView = gameInfoView;
    }
  }


  @Override
  protected void startSettingsActivity() {
    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity(intent);
  }

  @Override
  protected ListAdapter getGameInfoAdapter() {
    return mAdapter;
  }

  @Override
  protected void setGameInfos(List<GameInfo> games) {
    mAdapter.setGameInfos(games);
  }
}
