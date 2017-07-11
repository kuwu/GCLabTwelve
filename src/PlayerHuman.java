import java.util.Objects;
import java.util.Scanner;

/**
 * Created by kuwu on 2017/07/10.
 */
public class PlayerHuman extends Player {


  @Override
  public Roshambo generateRoshambo() {
     Scanner scan = new Scanner(System.in);
//    System.out.println("Whats your Name? ");
//    String name = scan.nextLine();
//    System.out.println("Welcome " + name);

    System.out.println("Choose Rock, Paper, Scissor");
    String input = scan.nextLine();

    Roshambo choice = null;


    if (input.equals( "R")) {
      choice = Roshambo.ROCK;
    } else if (input.equals( "P")) {
      choice = Roshambo.PAPER;
    } else if (input.equals( "S")) {
      choice = Roshambo.SCISSORS;
    }

   return choice;
  }


  }


