package net.llamaslayers.peashooter.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import net.llamaslayers.peashooter.core.PeaShooterGame;

public class PeaShooterGameJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("net/llamaslayers/peashooter/resources");
    PlayN.run(new PeaShooterGame());
  }
}
