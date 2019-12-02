import java.awt.*;
import java.util.Scanner;   // Allows us to get input from users

public class Main {

  public static void main(String[] args) {
    
    // System.out.println("Enter a word:");      // User prompt for input
    Scanner sc = new Scanner(System.in);      // Constructor method

    int userNumber = sc.nextInt();
    System.out.println(userNumber);
    
    double userNumber2 = sc.nextDouble();
    System.out.println(userNumber2);

    // String userInput = sc.next();             // Call the next() method to await user input

    // String uppercased = userInput.toUpperCase();        // call a string method to change to upercase
    // System.out.println(userInput);                      // return "entertainment"
    // System.out.println(uppercased);                     // prints "ENTERTAINMENT"

    // char firstCharacter = userInput.charAt(0);          // method to get index 0 of string character
    // System.out.println(firstCharacter);                 // prints "e"

    // System.out.println("Contains: " + userInput.contains("enter"));     // returns "true"
    // System.out.println("Contains: " + userInput.contains("Enter"));     // returns "false"

    // System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));   // returns "true"

  }
}