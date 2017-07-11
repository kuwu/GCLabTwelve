import java.util.Random;

/**
 * Created by kuwu on 2017/07/10.
 */
//public class Compare extends Player{
//
//  private PlayerHuman player;
//  private PlayerOne computer;
//  private Roshambo playerChoice;
//  private Roshambo computerChoice;
//  private Roshambo.RESULT result;
//
//  @Override
//  public Roshambo generateRoshambo() {
//  }
//
//  public Compare() {
//    player = new PlayerHuman();
//    computer = new PlayerOne();
//
//  }
//
//  public void play(){
//
//    playerChoice = player.getChoice();
//    computerChoice = computer.getChoice();
//    result = Roshambo.RESULT.getChoice();
//  }
//
//  public Roshambo.RESULT.getChoice()
//
//  {
//
//    if (playerChoice == computerChoice)
//         return Roshambo.RESULT.TIE;
//
//    switch (playerChoice) {
//
//      case ROCK:
//        return (computerChoice == Roshambo.SCISSORS ? Roshambo.RESULT.WIN : Roshambo.RESULT.LOSE);
//      case PAPER:
//        return (computerChoice == Roshambo.ROCK ? Roshambo.RESULT.WIN : Roshambo.RESULT.LOSE);
//      case SCISSORS:
//        return (computerChoice == Roshambo.PAPER ? Roshambo.RESULT.WIN : Roshambo.RESULT.LOSE);
//
//      return Roshambo.RESULT.LOSE;
//    }
//  }
//}
