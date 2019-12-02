import java.awt.*;

public class Main {

  public static void main(String[] args) {
    String userInput = "entertainment";                 // hardcode string
    String uppercased = userInput.toUpperCase();        // call a string method to change to upercase
    System.out.println(userInput);                      // return "entertainment"
    System.out.println(uppercased);                     // prints "ENTERTAINMENT"

    char firstCharacter = userInput.charAt(0);          // method to get index 0 of string character
    System.out.println(firstCharacter);                 // prints "e"

    System.out.println("Contains: " + userInput.contains("enter"));     // returns "true"
    System.out.println("Contains: " + userInput.contains("Enter"));     // returns "false"

    System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));   // returns "true"

  }
}