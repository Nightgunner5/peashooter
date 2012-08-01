package net.llamaslayers.peashooter.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import net.llamaslayers.peashooter.core.PeaShooterGame;

public class PeaShooterGameHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assets().setPathPrefix("peashooter/");
    PlayN.run(new PeaShooterGame());
  }
}
