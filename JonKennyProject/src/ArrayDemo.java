/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */


import java.util.Scanner;

public class ArrayDemo {

  // --ARRAY EXAMPLE CLASS-- //
  /**
   * Array example.
   */
  public static void arrayReverseOrder(Scanner scan) {

    // --SCANS IN ARRAY ELEMENTS-- //
    int n = ExceptionHandler.getGoodIntInput(scan);
    int[] arrayInput = new int[n];
    for (int i = 0; i < n; i++) {
      arrayInput[i] = scan.nextInt();
    }

    // --PRINTS ARRAY IN REVERSE ORDER-- //
    // --AS A SINGLE LINE OF SPACE-SEPERATED NUBERS-- //
    while (n > 0) {
      System.out.print(arrayInput[--n] + " ");
    }
  }

}
