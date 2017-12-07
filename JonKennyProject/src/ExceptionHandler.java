import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {

  public static int getGoodIntInput(Scanner scan) {
    boolean gottenGoodInput = false;
    int num = 0;
    while (gottenGoodInput == false) {
      try {
        num = scan.nextInt();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Requires an integer");
        scan.nextLine();
      }
    }
    return num;
  }
}
