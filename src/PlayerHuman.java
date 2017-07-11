import java.util.Objects;
import java.util.Scanner;

/**
 * Created by kuwu on 2017/07/10.
 */
public class PlayerHuman extends Player {


  @Override
  public Roshambo generateRoshambo() {
     Scanner scan = new Scanner(System.in);
    System.out.println("Choose 'R' for rock, 'P' for paper or 'S' for scissors");
    String input = scan.next().toLowerCase();

    Roshambo choice = null;


    if (input.equals( "r")) {
      choice = Roshambo.ROCK;
    } else if (input.equals( "p")) {
      choice = Roshambo.PAPER;
    } else if (input.equals( "s")) {
      choice = Roshambo.SCISSORS;
    } else {
      System.out.println("Error! ");
    }

   return choice;
  }


  }


