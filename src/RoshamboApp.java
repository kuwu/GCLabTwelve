import java.util.Scanner;

/**
 * Created by kuwu on 2017/07/10.
 */
public class RoshamboApp {

  public static void main(String[] args) {
    System.out.println("Welcome to Rock Paper Scissors!");


    PlayerHuman playerReal = new PlayerHuman();
    PlayerOne playerOne = new PlayerOne();
    PlayerTwo playerTwo = new PlayerTwo();
    playerReal.run();
    playerOne.run();
    playerTwo.run();

    getContinue();

  }

  private static void getContinue() {
    PlayerHuman playerReal = new PlayerHuman();
    PlayerOne playerOne = new PlayerOne();
    char userChar;
    boolean value = true;

    // loop allows user to continue using 'y or Y' until the user
    // types 'n or N' to quit    validates for 'y or Y' and 'n or N'
    do {
      userChar = getUserInput();
      if (userChar == 'y') {
        //
        playerReal.run();
        playerOne.run();

      } else if (userChar == 'n') {
        value = false;
      } else {
        System.out.println("\u001B[31m" + userChar + " is not a valid choice, please re-enter" + "\u001B[0m");
      }

    } while (value);

    // Informing the user the program has ended
    System.out.print("Goodbye");
  }

  public static char getUserInput() {
    Scanner scnr = new Scanner(System.in); // create a scanner object
    System.out.println("\nWould you like to continue?  (y / n):");
    // cast uppercase to lowercase
    String userInput = scnr.next().toLowerCase();

    return userInput.charAt(0);

  }

}
