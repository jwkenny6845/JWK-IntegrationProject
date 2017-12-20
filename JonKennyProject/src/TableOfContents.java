/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

import java.util.Random;
import java.util.Scanner;

public class TableOfContents {

  // --TABLE OF CONTENTS SWITCH METHOD-- //
  /**
   * Runs the Table of Contents switcher.
   * 
   * @param scan
   *          User input selecting a switch state
   */
  public static void select(Scanner scan, Random rng) {

    // --METHOD SELECTOR PROMPT-- //
    System.out.println(""
        + "---------------------------------------\n"
        + "Enter a Method Number to call a Method:\n"
        + "---------------------------------------");
    int method = ExceptionHandler.getGoodIntInput(scan);
    System.out.println("\n>>> You picked Method: (" + method + ") <<<\n");

    switch (method) {
      case 1:
        System.out.println("Enter Number:");
        int factorialInput = ExceptionHandler.getGoodIntInput(scan);
        System.out.println("\n\n==SOLUTION==\n"
            + factorialInput + "! = " + MethodVault.factorial(factorialInput));
        break;
      case 2:
        System.out.println(MethodVault.summation(scan));
        break;
      case 3:
        System.out.println(MethodVault.inBetween10and20(scan));
        break;
      case 4:
        System.out.println(MethodVault.hourglassSummation(scan, rng));
        break;
      case 5:
        MethodVault.arrayReverseOrder(scan);
        break;
      case 6:
        MethodVault.makeUpperCase(scan);
        break;
      case 7:
        Vehicle_PolymorphismDemo.doPolyDemo();
        break;
      case 8:
        MethodVault.stackDemo(scan, rng);
        break;
      case 9:
        MethodVault.queueDemo(scan, rng);
        break;
      case 10:
        MethodVault.search2DArray(scan, rng);
        break;
      default:
        System.out.println("METHOD (" + method + ") DOES NOT EXIST!");
        break;
    }
  }

}
