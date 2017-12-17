
/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

import java.util.Scanner;

public class TableOfContents {

  // --METHODS TOC SWITCH-- //
  /**
   * Runs the Table of Contents switcher.
   * 
   * @param scan
   *          User input selecting a switch state
   */
  public static void tableOfContents(Scanner scan) {

    // --METHOD SELECTOR PROMPT-- //
    System.out.println("---------------------------------------\n"
        + "Enter a Method Number to call a Method:"
        + "\n---------------------------------------");
    int method = ExceptionHandler.getGoodIntInput(scan);
    System.out.println("\nYou picked Method (" + method + ")");

    // --METHOD INPUT PROMPT-- //
    System.out.println("Enter Number:");

    switch (method) {
      case 1:
        int factorialInput = ExceptionHandler.getGoodIntInput(scan);
        System.out.println("\n\n" + factorialInput + "! = "
            + MethodVault.factorial(factorialInput));
        break;
      case 2:
        int summationInput = ExceptionHandler.getGoodIntInput(scan);
        System.out.println("\n\n" + summationInput
            + " + (all whole numbers less than " + summationInput + ") = "
            + MethodVault.summation(summationInput));
        break;
      case 3:
        double doubleInput = ExceptionHandler.getGoodDoubleInput(scan);
        System.out.println("\n\nIs " + doubleInput + " in between 10 and 20?"
            + "\n\n" + MethodVault.inBetween10and20(doubleInput));
        break;
//      case 4:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
//      case 5:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
//      case 6:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
//      case 7:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
//      case 8:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
//      case 9:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
//      case 10:
//        System.out.println(
//            "\n\n" + userInput + "! = " + MethodVault.factorial(userInput));
//        break;
      default:
        System.out
            .println("\n*!!!--METHOD (" + method + ") DOES NOT EXIST--!!!*");
        break;
    }
  }

}
