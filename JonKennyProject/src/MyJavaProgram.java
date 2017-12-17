
/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

import java.util.Scanner;

public class MyJavaProgram {

  static Scanner scan;

  // HEADER: MAIN METHOD:
  /**
   * Jonathan Kenny's - Integration Project - COP 2006 - Prof. Vanselow.
   * 
   * @param args
   *          - Needed for main method
   */
  public static void main(String[] args) {
    scan = new Scanner(System.in);
    System.out.println("Welcome to Jonathan Kenny's Integration Project:\n"
        + "A portfolio of things learned in COP 2006\n" + "\n"
        + "    ? What would you like to perform ?\n"
        + "   ------------------------------------" + "\n"
        + "   (1)-\tFind the factorial of a number\n"
        + "   (2)-\tSummation of a number and all whole numbers less than it\n"
        + "   (3)-\tDetermine if a number is in between 10 and 20\n"
    // + " (4)\tFind the factorial of A NUMBER\n"
    // + " (5)\tFind the factorial of A NUMBER\n"
    // + " (6)\tFind the factorial of A NUMBER\n"
    // + " (7)\tFind the factorial of A NUMBER\n"
    // + " (8)\tFind the factorial of A NUMBER\n"
    // + " (9)\tFind the factorial of A NUMBER\n"
    // + " (10)\tFind the factorial of A NUMBER\n"
    );

    char continueProgram = 'y';

    while (continueProgram != 'n') {
      TableOfContents.tableOfContents(scan);
      System.out.println("\n\n\n---------------------------------\n"
          + "Enter 'any key' to continue or 'n' to quit."
          + "\n---------------------------------");
      continueProgram = ExceptionHandler.getGoodCharInput(scan);
    }

    System.out.println(
        "\n\n\n~~~~~~~~~\n~~~~~~~~~\n" + "Good-Bye!\n~~~~~~~~~\n~~~~~~~~~");
    scan.close();

  }
}
