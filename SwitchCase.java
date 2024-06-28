/* MODERN SWITCH CASE STATEMENTS*/

class SwitchCase {
  public static void main(String args[]) {
      String choice = "sudheer";
      String result = switch(choice) {
          case "sudheer" -> "This is case sudheer";
          case "praveen" -> "This is case praveen";
          case "mohan" -> "This is case mohan";
          case "latha" -> "This is case latha";
          case "rohit" -> "This is case 1";
          default -> "This is default case";
      };
      
      System.out.println(result);
  }
}
