/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

import java.util.Scanner;

public class JonathanKenny_IntegrationProject {

    static Scanner scan;

    // HEADER: MAIN METHOD:
    public static void main(String[] args) {
      scan = new Scanner(System.in);
      System.out.println(
                "Welcome to Jonathan Kenny's Integration Project:\n"
              + "A portfolio of things learned in COP 2006\n"
              + "\n"
              + "\n"
              + "    ? What would you like to perform ?\n"
              + "   ------------------------------------"
              + "\n"
              + "   (1)-\tFind the factorial of a number\n"
              + "   (2)-\tSummation of a number and all whole numbers less than it\n"
              + "   (3)-\tDetermine if a number is in between 10 and 20\n"
            //+ "  (4)\tFind the factorial of A NUMBER\n"
            //+ "  (5)\tFind the factorial of A NUMBER\n"
            //+ "  (6)\tFind the factorial of A NUMBER\n"
            //+ "  (7)\tFind the factorial of A NUMBER\n"
            //+ "  (8)\tFind the factorial of A NUMBER\n"
            //+ "  (9)\tFind the factorial of A NUMBER\n"
            //+ "  (10)\tFind the factorial of A NUMBER\n"
              );

        int continueProgram = 1;

        while (continueProgram == 1) {
            TableOfContents.tableOfContents(scan);
            System.out.println("\n\n\n---------------------------------\n"
                    + "Press 1 to continue or 2 to quit."
                    + "\n---------------------------------");
            continueProgram = ExceptionHandler.getGoodIntInput(scan);
        }

        System.out.println("\n\n\n~~~~~~~~~\n~~~~~~~~~\n"
                + "Good-Bye!\n~~~~~~~~~\n~~~~~~~~~");
        scan.close();

    }
}


