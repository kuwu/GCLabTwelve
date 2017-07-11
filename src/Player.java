/**
 * Created by kuwu on 2017/07/10.
 */
public abstract class Player {

  private String name;
  private Roshambo choice;




  public Roshambo getChoice() {
    return choice;
  }

  public void setChoice(Roshambo choice) {
    this.choice = choice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public abstract Roshambo generateRoshambo();

  public String getHome() {
    return name;
  }

  public Roshambo choice() {
    return choice;
  }

  public void run() {
    generateRoshambo();

  }

}
