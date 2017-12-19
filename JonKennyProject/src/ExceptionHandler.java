/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// --EXCEPTION HANDLER CLASS-- //
/**
 * This class validates all user submitted input is the correct data type.
 * 
 * @author Jonathan Kenny
 */
public class ExceptionHandler {

  // --INT INPUT CHECKER METHOD-- //
  /**
   * Checks to see if user input is an integer.
   * 
   * @param scan
   *          Scanner object that receives the user input
   * @return Returns the validated input for use in the program
   */
  public static int getGoodIntInput(Scanner scan) {
    boolean gottenGoodInput = false;
    int intInput = 0;
    while (gottenGoodInput == false) {
      try {
        intInput = scan.nextInt();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println(">>ERROR<< "
            + "Enter an integer to continue operation:");
        scan.nextLine();
      }
    }
    return intInput;
  }

  // --DOUBLE INPUT CHECKER METHOD-- //
  /**
   * Checks to see if user input is a decimal number.
   * 
   * @param scan
   *          Scanner object that receives the user input
   * @return Returns the validated input for use in the program
   */
  public static double getGoodDoubleInput(Scanner scan) {
    boolean gottenGoodInput = false;
    double doubleInput = 0;
    while (gottenGoodInput == false) {
      try {
        doubleInput = scan.nextDouble();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println(">>ERROR<< "
            + "Enter a decimal number to continue operation:");
        scan.nextLine();
      }
    }
    return doubleInput;
  }

  // --BOOLEAN INPUT CHECKER METHOD-- //
  /**
   * Checks to see if user input is a boolean (true/false).
   * 
   * @param scan
   *          Scanner object that receives the user input
   * @return Returns the validated boolean input for use in the program
   */
  public static boolean getGoodBooleanInput(Scanner scan) {
    boolean gottenGoodInput = false;
    boolean booleanInput = false;
    while (gottenGoodInput == false) {
      try {
        booleanInput = scan.nextBoolean();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println(">>ERROR<< "
            + "Enter a boolean (true/false) to continue operation:");
        scan.nextLine();
      }
    }
    return booleanInput;
  }

  // --CHAR INPUT CHECKER METHOD-- //
  /**
   * Checks to see if user input is a char.
   * 
   * @param scan
   *          Scanner object that receives the user input
   * @return Returns the validated char input for use in the program
   */
  public static char getGoodCharInput(Scanner scan) {
    boolean gottenGoodInput = false;
    char charInput = 0;
    while (gottenGoodInput == false) {
      try {
        charInput = scan.next().charAt(0);
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println(">>ERROR<< "
            + "Enter a single character to continue operation:");
        scan.nextLine();
      }
    }
    return charInput;

  }

  // --STRING INPUT CHECKER METHOD-- //
  /**
   * Checks to see if user input is a String.
   * 
   * @param scan
   *          Scanner object that receives the user input
   * @return Returns the validated String input for use in the program
   */
  public static String getGoodStringInput(Scanner scan) {
    boolean gottenGoodInput = false;
    String stringInput = null;
    while (gottenGoodInput == false) {
      try {
        stringInput = scan.nextLine();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println(">>ERROR<< "
            + "Enter any String to continue operation:");
        scan.nextLine();
      }
    }
    return stringInput;
  }
}
