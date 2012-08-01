package net.llamaslayers.peashooter.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import net.llamaslayers.peashooter.core.PeaShooterGame;

public class PeaShooterGameActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("net/llamaslayers/peashooter/resources");
    PlayN.run(new PeaShooterGame());
  }
}
