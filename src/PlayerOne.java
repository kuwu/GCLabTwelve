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
      Roshambo roshambo = null;

      boolean player = true;
      if (player)

      {
        switch (comp) {
          case "0":
            System.out.println("Computer chose Rock");
            roshambo=Roshambo.ROCK;
            return roshambo;
          case "1":
            System.out.println("Computer chose Paper");
            roshambo=Roshambo.PAPER;
            return roshambo;
          case "2":
            System.out.println("Computer chose Scissors");
            roshambo=Roshambo.SCISSORS;
            return roshambo;
          default:
            System.out.println("ERROR!");
            //return choice;

        }
      }   return roshambo;




    }
    //return choice;
  }
}







