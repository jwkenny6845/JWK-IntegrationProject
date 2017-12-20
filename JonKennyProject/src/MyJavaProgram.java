
/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

import java.util.Random;
import java.util.Scanner;

public class MyJavaProgram {

  static Scanner scan;
  static Random rng;

  // --PROGRAM MAIN METHOD-- //
  /**
   * Jonathan Kenny's - Integration Project - COP 2006 - Prof. Vanselow.
   * 
   * @param args
   *          - Needed for main method
   */
  public static void main(String[] args) {
    scan = new Scanner(System.in);
    rng = new Random();
    System.out.println(""
        + "****************************************************\n"
        + "* Welcome to Jonathan Kenny's Integration Project: *\n"
        + "*    A portfolio of things learned in COP 2006     *\n"
        + "****************************************************\n\n"

        + "-------------------------------------" + "\n"
        + "---------- SELECT A METHOD ----------\n"
        + "-------------------------------------" + "\n\n"

        + " (1)- [FACTORIAL]:\n"
        + "\t*Find the factorial of a number\n\n"

        + " (2)- [SUMMATION]:\n"
        + "\t*Summation of a number and all whole numbers less than it\n\n"

        + " (3)- [10 < X < 20]:\n"
        + "\t*Determine if a number is in between 10 and 20\n\n"

        + " (4)- [HOURGLASS SUMMATION]:\n"
        + "\t*Find the largest Hourglass Shape Summation present"
        + " within an array\n\n"

        + " (5)- [REVERSE PRINT AN ARRAY]:\n"
        + "\t*Reverse print the array entered\n\n"

        + " (6)- [CHANGE STRING TO UPPERCASE]:\n"
        + "\t*Enter a String and then have it returned in all UPPERCASE\n\n"

        + " (7)- [POLYMORPHISM DEMO]:\n"
        + "\t*(See full code for example of concept)\n\n"

        + " (8)- [STACK DEMO]:\n"
        + "\t*Create a stack and then pop(remove) elements from it\n\n"

        + " (9)- [QUEUE DEMO]:\n"
        + "\t*Create a queue and then remove elements from it\n\n"

        + " (10)- [SEARCH 2D ARRAY]:\n"
        + "\t*Create a queue and then remove elements from it\n\n");

    // --PROGRAM CONTINUE LOOP-- //
    char continueProgram = 'y';
    while (continueProgram != 'n') {
      TableOfContents.select(scan, rng);
      System.out.println("\n\n\n-------------------------------------------\n"
          + "Enter 'any key' to continue or 'n' to quit."
          + "\n-------------------------------------------");
      continueProgram = ExceptionHandler.getGoodCharInput(scan);
    }

    // --PROGRAM QUIT MESSAGE-- //
    System.out.println(
        "\n\n\n~~~~~~~~~\n~~~~~~~~~\n" + "Good-Bye!\n~~~~~~~~~\n~~~~~~~~~");
    scan.close();

  }
}
