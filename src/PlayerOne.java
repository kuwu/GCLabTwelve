import java.util.Random;

/**
 * Created by kuwu on 2017/07/10.
 */
public class PlayerOne extends Player {

  @Override
  public Roshambo generateRoshambo() {

    {

      // computer's move
      Random random = new Random();
      Integer choice = random.nextInt(3); // (n-1) 0 = rock, 1 = paper, 2 = scissors
      String comp = choice.toString();

      boolean player = true;
      if (player)

      {
        switch (comp) {
          case "0":
            System.out.println("Computer chose Rock");
            break;
          case "1":
            System.out.println("Computer chose Paper");
            break;
          case "2":
            System.out.println("Computer chose Scissors");
            break;
          default:
            System.out.println("ERROR!");
            break;

        }
      }

    }
    return choice();
  }
}







