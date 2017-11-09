import java.util.Scanner;

/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

public class JonathanKenny_IntegrationProject {

  static Scanner scanContinue = new Scanner(System.in);

  // HEADER: MAIN METHOD:
  public static void main(String[] args) {
    System.out.println(
            "Welcome to Jonathan Kenny's Integration Project:\n"
            + "A portfolio of things learned in COP 2006\n"
            + "\n"
            + "METHODS AVAILABLE TO CALL:\n"
            + "\n"
            + "  (0)\tPSI_1.method\n"
            + "  (1)\tPSI_1.Factorial\n"
            + "  (2)\tPSI_2.ifelse\n"
            + "  (3)\tPSI_2.whileloop\n"
            + "  (4)\tPSI_2.forloop\n"
            + "  (5)\tPSI_2.relationaloperators\n"
            + "  (6)\tPSI_2.conditionaloperators\n"
            + "  (7)\tPSI_2.class\n"
            + "  (8)\tPSI_2.array\n"
            + "  (9)\tPSI_3.method\n"
            + "\n"
            + "Enter a Method Number to call a Method:"
            );
     
    String cont = "y";
    do {
      TableOfContents.tableOfContents();
      System.out.println("Enter y/n to continue");
      cont = scanContinue.nextLine();

    } while (cont.equalsIgnoreCase("y"));
    scanContinue.close();
  }

}

////////////////////////////////
// PSI_1.method();
/////////////////
 // PSI_2.apple();
 // PSI_2.ifelse();  //In TOC Menu
// PSI_2.switch();
// PSI_2.whileloop();
// PSI_2.forloop();
// PSI_2.relationaloperators();
// PSI_2.conditionaloperators();
// PSI_2.class();
// PSI_2.array();
/////////////////
// PSI_3.method();


/*
if (input == 1) {
  System.out.println(PSI_2.Factorial(number));
} else if (input == 2) {
  PSI_2.Factorial(6);
} else if (input == 3) {
  PSI_2.Factorial(7);
} else if (input == 4) {
  PSI_2.Factorial(8);
} else {
  System.out.println("You picked WRONG");
}
*/         
