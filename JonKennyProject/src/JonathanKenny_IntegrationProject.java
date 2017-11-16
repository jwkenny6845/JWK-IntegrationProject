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
              + "METHODS AVAILABLE TO CALL:\n"
              + "**************************\n"
              + "\n"
              + "  (1)\tPSI_2.factorial\n"
              + "  (2)\tPSI_2.summation\n"
              + "  (3)\tPSI_2.inBetween10and20\n"
            //+ "  (4)\tPSI_2.factorial\n"
            //+ "  (5)\tPSI_2.factorial"
            //+ "  (6)\tPSI_2.factorial"
            //+ "  (7)\tPSI_2.factorial"
            //+ "  (8)\tPSI_2.factorial"
            //+ "  (9)\tPSI_2.factorial"
            //+ "  (10)\tPSI_2.factorial"
              );

        int continueProgram = 1;

        while (continueProgram == 1) {
            TableOfContents.tableOfContents(scan);
            System.out.println("\n\n\n---------------------------------\n"
                    + "Press 1 to continue or 2 to quit."
                    + "\n---------------------------------");
            continueProgram = scan.nextInt();
        }

        System.out.println("\n\n\n~~~~~~~~~\n~~~~~~~~~\n"
                + "Good-Bye!\n~~~~~~~~~\n~~~~~~~~~");
        scan.close();

    }
}


