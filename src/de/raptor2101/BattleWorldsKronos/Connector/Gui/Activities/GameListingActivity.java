package de.raptor2101.BattleWorldsKronos.Connector.Gui.Activities;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import de.raptor2101.BattleWorldsKronos.Connector.Data.Entities.Game;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.GamesAdapater;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.R;
import de.raptor2101.BattleWorldsKronos.Connector.Gui.Controls.GameView;

public class GameListingActivity extends AbstractGameListingActivity implements OnItemClickListener {
  private GamesAdapater mAdapter = new GamesAdapater(this);
  GameView mExpandedView;
  
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
    GameView gameView = (GameView) view;
    if(gameView.isExpanded()){
      gameView.collapse();
      mExpandedView = null;
    } else{
      if(mExpandedView != null){
        mExpandedView.collapse();
      }
      gameView.expand();
      mExpandedView = gameView;
    }
  }


  @Override
  protected void startSettingsActivity() {
    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity(intent);
  }

  @Override
  protected ListAdapter getGamesAdapter() {
    return mAdapter;
  }

  @Override
  protected void setGames(List<Game> games) {
    mAdapter.setGames(games);
  }
}
