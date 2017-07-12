
import java.util.Random;


/**
 * Created by kuwu on 2017/07/10.
 */
public class PlayerOne extends Player {


  @Override
  public Roshambo generateRoshambo() {


    // computer's move
    Random random = new Random();
    Integer choice = random.nextInt(3); // (n-1) 0 = rock, 1 = paper, 2 = scissors
    String player = choice.toString();
    Roshambo roshambo = null;

    switch (choice) {
      case 0 :
        //System.out.println("Player 1 chose Rock");
        roshambo = Roshambo.ROCK;
        break;
      case 1 :
        //System.out.println("Player 1 chose Paper");
        roshambo = Roshambo.PAPER;
        break;
      case 2 :
        //System.out.println("Player 1 chose Scissors");
        roshambo = Roshambo.SCISSORS;
        break;
      default:
        System.out.println("ERROR!");
        break;
    }
    return roshambo;
  }

}







