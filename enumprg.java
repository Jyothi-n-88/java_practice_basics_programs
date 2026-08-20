enum Level {
  LOW("Low level...."),
  MEDIUM("Medium level.."),
  HIGH("High level.");
  private String message;

//constructor
  private Level(String message) {
    this.message = message;
  }

  public String getDescription() {
    return message;
  }
}

public class enumprg {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; //creating enum variable and initialising it
    System.out.println(myVar.getDescription()); //accessing enum class method with the help of enum variable created
  }
}
