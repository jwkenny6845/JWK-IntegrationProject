
/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class MethodVault {

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --FACTORIAL METHOD-- //
  /**
   * Factorial method.
   * 
   * @param factorialInput
   *          user input
   * @return factorial value of user input
   */
  public static int factorial(int factorialInput) {
    // --BASE CASE-- //
    if (factorialInput == 1) {
      return 1;
      // --RECURSIVE CASE-- //
    } else {
      return factorialInput * factorial(factorialInput - 1);
    }
  }

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --SUMMATION METHOD-- //
  /**
   * Sums user input with ever whole number less than it.
   * 
   * @param scan
   *          user input to have summation formula ran on
   * @return the summation of the user input
   */
  public static String summation(Scanner scan) {
    System.out.println("Enter Number:");
    int summationInput = ExceptionHandler.getGoodIntInput(scan);
    int sum = 0;
    for (int i = 1; i <= summationInput; i++) {
      sum += i;
    }
    return ("\n\n==SOLUTION==\n"
        + summationInput + " + (all whole numbers less than "
        + summationInput + ") = " + sum);
  }

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --IN BETWEEN 10 AND 20 METHOD-- //
  /**
   * Determines if the user input is in between 10 and 20.
   * 
   * @param scan
   *          user input that will be evaluated
   * @return yes/no if the user input is in between 10 and 20
   */
  public static String inBetween10and20(Scanner scan) {
    System.out.println("Enter a number to see if it is in between 10 and 20:");
    double tenAndTwentyInput = ExceptionHandler.getGoodDoubleInput(scan);
    if (10 < tenAndTwentyInput && 20 > tenAndTwentyInput) {
      return "\n\n==SOLUTION==\n"
          + "YES, " + tenAndTwentyInput + " is in between 10 and 20";
    } else {
      return "\n\n==SOLUTION==\n"
          + "NO, " + tenAndTwentyInput + " is not in between 10 and 20";
    }
  }

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --HOURGLASS SUMMATION METHOD-- //
  /**
   * Hourglass Summation of an Array.
   * 
   * @return maxSum
   */
  public static String hourglassSummation(Scanner scan, Random rng) {

    System.out.println("Enter Number of Rows in Array "
        + "(Must be 3 or greater):");
    int hgSumRows = ExceptionHandler.getGoodIntInput(scan);
    if (hgSumRows >= 3) {
      System.out.println("\n>>> " + hgSumRows + " Rows selected <<<\n");
    } else {
      hgSumRows = 3;
      System.out.println("\n>>> ROWS VALUE OUT OF RANGE: "
          + "Using DEFAULT value of 3 <<<\n");
    }

    System.out.println("Enter Number of Columns in Array "
        + "(Must be 3 or greater):");
    int hgSumCols = ExceptionHandler.getGoodIntInput(scan);
    if (hgSumCols >= 3) {
      System.out.println("\n>>> " + hgSumCols + " Columns selected <<<\n");
    } else {
      hgSumCols = 3;
      System.out.println("\n>>> COLUMNS VALUE OUT OF RANGE: "
          + "Using DEFAULT value of 3 <<<\n");
    }

    scan.nextLine();

    boolean wantRng;
    System.out.println(
        "Do you want to use Randomly Generated Numbers for the array elements?\n"
            + "('Y' for YES) or ('any key' for NO):");
    String randomChoice = scan.nextLine();

    wantRng = randomChoice.equals("y") ? true : false;

    System.out.println("\nEnter each integer for the Array:\n"
        + "  * " + (hgSumRows * hgSumCols) + " numbers are needed *\n"
        + "  * Press 'return' after each entry *\n"
        + "  * Array fills left-to-right and then top-to-bottom *\n\n");

    int[][] arr = new int[hgSumRows][hgSumCols];
    for (int i = 0; i < hgSumRows; i++) {
      for (int j = 0; j < hgSumCols; j++) {
        if (wantRng == false) {
          arr[i][j] = ExceptionHandler.getGoodIntInput(scan);
        } else {
          arr[i][j] = rng.nextInt(100);
        }
      }

    }

    System.out.println("This is the Array you entered:\n"
        + Arrays.deepToString(arr).replace("], ", "]\n"));

    // --INITIALIZES maxSum TO THE LOWEST POSSIBLE VALUE-- //
    int maxSum = Integer.MIN_VALUE;

    // --IF 3x3 OR LARGER RUN HOURGLASS SUMMATION-- //
    if (hgSumRows >= 3 && hgSumCols >= 3) {

      // --LOOP THROUGH ALL POSSIBLE HOURGLASSES-- //
      for (int ii = 0; ii < (hgSumRows - 2); ii++) {
        for (int jj = 0; jj < (hgSumCols - 2); jj++) {

          // --HOURGLASS SUMMATION FORMULA-- //
          int currentHourglassSum = arr[ii][jj] + arr[ii][jj + 1]
              + arr[ii][jj + 2] + arr[ii + 1][jj + 1] + arr[ii + 2][jj]
              + arr[ii + 2][jj + 1] + arr[ii + 2][jj + 2];

          // --SETS currentHourglassSum TO maxSum IF GREATER-- //
          if (currentHourglassSum > maxSum) {
            maxSum = currentHourglassSum;
          }
        }
      }
      return ("\n\n==SOLUTION==\n" + maxSum
          + " is the greatest sum possible out of all the different"
          + " hourglass shapes in the array.");
    } else {
      return ("\n\nDOES NOT EXIST: Array to small to evaluate!");
    }
  }

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --ARRAY EXAMPLE
  /**
   * Array example.
   */
  public static void arrayReverseOrder(Scanner scan) {

    // --SCANS IN HOW LONG ARRAY WILL BE-- //
    System.out.println("Enter how many element will be in the array:\n");
    int n = ExceptionHandler.getGoodIntInput(scan);

    // --SCANS IN ARRAY ELEMENTS-- //
    System.out.println("Enter each integer for the Array:\n"
        + "  * " + n + " numbers are needed *\n"
        + "  * Press 'return' after each entry *\n"
        + "  * Array fills left-to-right *");
    int[] arrayInput = new int[n];
    for (int i = 0; i < n; i++) {
      arrayInput[i] = ExceptionHandler.getGoodIntInput(scan);
    }

    // --PRINTS ARRAY IN REVERSE ORDER-- //
    // --AS A SINGLE LINE OF SPACE-SEPERATED NUBERS-- //
    System.out.print("\n\n==SOLUTION==\n");
    while (n > 0) {
      System.out.print(arrayInput[--n] + " ");
    }
  }

  // --DOES IT CONTAIN METHOD-- //
  /**
   * Does a string contain another string Method.
   * 
   * @param scan
   *          scans in users string
   */
  public static void makeUpperCase(Scanner scan) {

    scan.nextLine();

    System.out.println("Enter a String to be changed into all UPPERCASE:");
    String userString = scan.nextLine();
    String changedUpperString = userString.toUpperCase();

    // Display the two strings for comparison.
    System.out.println("Original String: " + userString);
    System.out.println("String in uppercase: " + changedUpperString);
  }

  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --STACK DEMO METHOD-- //
  /**
   * Stack Demo Method.
   * 
   * @param scan
   *          scans in user input
   * @param rng
   *          uses Random Number Generation for method input
   */
  public static void stackDemo(Scanner scan, Random rng) {

    Stack<Integer> stack = new Stack<>();

    System.out.println("Enter size of Stack: \n(Must be 1 or greater):");
    int stackSize = ExceptionHandler.getGoodIntInput(scan);
    if (stackSize > 0) {
      System.out.println("\n>>> Stack will be "
          + stackSize + " elements long <<<\n");
    } else {
      stackSize = 5;
      System.out.println("\n>>> STACK VALUE OUT OF RANGE: "
          + "Using DEFAULT value of 5 <<<\n");
    }

    scan.nextLine();

    boolean wantRng;
    System.out.println(
        "Do you want to use Randomly Generated Numbers for the Stack elements?"
            + "\n('Y' for YES) or ('any key' for NO):");
    String randomChoice = scan.nextLine();
    wantRng = randomChoice.equals("y") ? true : false;

    System.out.println("\nEnter each integer for the Stack:\n"
        + "  * " + stackSize + " numbers are needed *\n"
        + "  * Press 'return' after each entry *\n"
        + "  * Stack fills left-to-right *\n\n");

    for (int i = 0; i < stackSize; i++) {
      if (wantRng == false) {
        stack.push(ExceptionHandler.getGoodIntInput(scan));
      } else {
        stack.push(rng.nextInt(100));
      }
    }

    // --PRINT DEMO STACK-- //
    System.out.println("Demo Stack: " + stack);

    System.out
        .println("Enter ammount of elements to Remove(Pop) from the of Stack: "
            + "\n(Must be not be greater than " + stackSize + "):");
    int popAmmount = ExceptionHandler.getGoodIntInput(scan);
    if (popAmmount >= 0 && popAmmount <= stackSize) {
      System.out.println("\n>>> Removing(Popping) "
          + popAmmount + " elements from the stack <<<\n");
    } else {
      popAmmount = 1;
      System.out.println("\n>>> REMOVE(POP) VALUE OUT OF RANGE: "
          + "Using DEFAULT value of 1 <<<\n");
    }

    for (int i = 0; i < popAmmount; i++) {
      stack.pop();
    }

    // --PRINT DEMO STACK AFTER POPPING-- //
    System.out.println("Demo Stack: " + stack);

  }
  
  /////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  // --QUEUE DEMO METHOD-- //
  /**
   * QUEUE Demo Method.
   * 
   * @param scan
   *          scans in user input
   * @param rng
   *          uses Random Number Generation for method input
   */
  public static void queueDemo(Scanner scan, Random rng) {

    Queue<Integer> queue = new LinkedList<>();

    System.out.println("Enter size of Queue: \n(Must be 1 or greater):");
    int queueSize = ExceptionHandler.getGoodIntInput(scan);
    if (queueSize > 0) {
      System.out.println("\n>>> Queue will be "
          + queueSize + " elements long <<<\n");
    } else {
      queueSize = 5;
      System.out.println("\n>>> QUEUE VALUE OUT OF RANGE: "
          + "Using DEFAULT value of 5 <<<\n");
    }

    scan.nextLine();

    boolean wantRng;
    System.out.println(
        "Do you want to use Randomly Generated Numbers for the Queue elements?"
            + "\n('Y' for YES) or ('any key' for NO):");
    String randomChoice = scan.nextLine();
    wantRng = randomChoice.equals("y") ? true : false;

    System.out.println("\nEnter each integer for the Queue:\n"
        + "  * " + queueSize + " numbers are needed *\n"
        + "  * Press 'return' after each entry *\n"
        + "  * Queue fills left-to-right *\n\n");

    for (int i = 0; i < queueSize; i++) {
      if (wantRng == false) {
        queue.add(ExceptionHandler.getGoodIntInput(scan));
      } else {
        queue.add(rng.nextInt(100));
      }
    }

    // --PRINT DEMO QUEUE-- //
    System.out.println("Demo Queue: " + queue);

    System.out
        .println("Enter ammount of elements to Remove from the of Queue: "
            + "\n(Must be not be greater than " + queueSize + "):");
    int popAmmount = ExceptionHandler.getGoodIntInput(scan);
    if (popAmmount >= 0 && popAmmount <= queueSize) {
      System.out.println("\n>>> Removing "
          + popAmmount + " elements from the Queue <<<\n");
    } else {
      popAmmount = 1;
      System.out.println("\n>>> REMOVE VALUE OUT OF RANGE: "
          + "Using DEFAULT value of 1 <<<\n");
    }

    for (int i = 0; i < popAmmount; i++) {
      queue.remove();
    }

    // --PRINT DEMO STACK AFTER POPPING-- //
    System.out.println("Demo Queue: " + queue);

  }

}
