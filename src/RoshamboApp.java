import java.util.Scanner;

/**
 * A simple program that allows the user to play rock, paper, scissors against two computer players.
 * Computer player one goes all out and  cycles through r, p and s - while computer player two always
 * returns a rock choice.
 * Created by kuwu on 2017/07/10.
 */
public class RoshamboApp {

  public static void main(String[] args) {
    System.out.println("Welcome to Rock Paper Scissors!");
    Scanner scan = new Scanner(System.in);
    System.out.println("Whats your Name? ");
    String name = scan.nextLine();
    System.out.println("Welcome " + name);

    char userChar = 'y';
    while (userChar == 'y') {

      Player computer = pickPlayer(scan);

      PlayerHuman human = new PlayerHuman();

      human.setName(name);

      Roshambo opponentChoice = computer.run();

      //System.out.println("Computer chose " + opponentChoice);

      evaluateRoshambo(human.run(), opponentChoice);

      System.out.println("Computer chose " + opponentChoice);

      userChar = getUserInput();
    }

  }

  private static Player pickPlayer(Scanner scan) {
    Player p;
    System.out.println("Play against Player 1 or Player 2  ( Type 1 or 2 )");
    int player = scan.nextInt();
    if (player == 1) {
      p = new PlayerOne();

    } else {
      p = new PlayerTwo();
    }
    return p;
  }

  public static char getUserInput() {
    Scanner scnr = new Scanner(System.in); // create a scanner object
    System.out.println("\nWould you like to continue?  (y / n):");
    // cast uppercase to lowercase
    String userInput = scnr.next().toLowerCase();

    return userInput.charAt(0);

  }

  public static boolean evaluateRoshambo(Roshambo choice1, Roshambo choice) {

    if (choice1.equals(choice)) {
      System.out.println("It's a tie");

    }
    if (choice1.equals(Roshambo.ROCK) && choice.equals(Roshambo.SCISSORS)) {
      System.out.println("You won!");
      return true;
    }
    if (choice1.equals(Roshambo.PAPER) && choice.equals(Roshambo.ROCK)) {
      System.out.println("You won");
      return true;
    }
    if (choice1.equals(Roshambo.SCISSORS) && choice.equals(Roshambo.PAPER)) {

      System.out.println("You won");
      return true;
    } else {
      System.out.println("Your lost!");
      return false;
    }

  }

}