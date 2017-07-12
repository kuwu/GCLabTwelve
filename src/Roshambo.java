

/**
 * Created by kuwu on 2017/07/10.
 */
public enum Roshambo {
  ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");

  private String playerName;

  Roshambo(String playerName) {
    this.playerName = playerName;
  }

  @Override
  public String toString() {return playerName;}











}

