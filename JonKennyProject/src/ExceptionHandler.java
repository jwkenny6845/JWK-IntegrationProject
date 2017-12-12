import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {

  // INT INPUT VALIDATOR //
  public static int getGoodIntInput(Scanner scan) {
    boolean gottenGoodInput = false;
    int intInput = 0;
    while (gottenGoodInput == false) {
      try {
        intInput = scan.nextInt();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Requires an integer");
        scan.nextLine();
      }
    }
    return intInput;
  }

  // DOUBLE INPUT VALIDATOR //
  public static double getGoodDoubleInput(Scanner scan) {
    boolean gottenGoodInput = false;
    double doubleInput = 0;
    while (gottenGoodInput == false) {
      try {
        doubleInput = scan.nextDouble();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Requires a decimal number");
        scan.nextLine();
      }
    }
    return doubleInput;
  }

  // BOOLEAN INPUT VALIDATOR //
  public static boolean getGoodBooleanInput(Scanner scan) {
    boolean gottenGoodInput = false;
    boolean booleanInput = false;
    while (gottenGoodInput == false) {
      try {
        booleanInput = scan.nextBoolean();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Requires an decimal number");
        scan.nextLine();
      }
    }
    return booleanInput;
  }

  // CHAR INPUT VALIDATOR //
  public static char getGoodCharInput(Scanner scan) {
    boolean gottenGoodInput = false;
    char charInput = 0;
    while (gottenGoodInput == false) {
      try {
        charInput = scan.next().charAt(0);
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Requires a single character");
        scan.nextLine();
      }
    }
    return charInput;
  }

}
