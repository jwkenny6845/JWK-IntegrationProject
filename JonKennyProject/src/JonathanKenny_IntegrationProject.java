import java.util.Scanner;

/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */


/**
 * An if else statement
 * ---(Used in the "PSI_2.factorial" method)
 * 
 * 
 * A switch statement
 * ---(Used in the "TableOfContents.tableOfContents" method)
 * 
 * 
 * while loop
 * ---(Used in the "JonathanKenny_IntegrationProject.main" method)
 * 
 * 
 * for loop
 * ---(Used in the "PSI_2.summation" method)
 * 
 * 
 * relational operators
 * ---( "==" is used in the "JonathanKenny_IntegrationProject.main" method)
 * ---( "==" is used in the "PSI_2.factorial" method)
 * ---( "<=" is used in the "PSI_2.summation" method)
 * ---( "<" and ">" are used in the "PSI_2.inBetween10and20" method)
 * 
 * 
 * conditional operators
 * ---( "&&" used in the "PSI_2.inBetween10and20" method)
 * 
 * 
 * dictionary/map
 * ---(Used in the "PhoneBookMap" class)
 * 
 * 
 * array (Code that manually finds smallest, gets sum, 
 *        and identifies index where value was found)
 * ---(Example of an array in the "ArrayExample" class)
 */



public class JonathanKenny_IntegrationProject {

    static Scanner scanContinue = new Scanner(System.in);


    // HEADER: MAIN METHOD:
    public static void main(String[] args) {
        System.out.println("Welcome to Jonathan Kenny's Integration Project:\n"
                + "A portfolio of things learned in COP 2006\n"
                + "\n"
                + "\n"
                + "METHODS AVAILABLE TO CALL:\n"
                + "**************************\n"
                + "\n"
                + "  (1)\tPSI_2.factorial\n"
                + "  (2)\tPSI_2.summation\n"
                + "  (3)\tPSI_2.inBetween10and20\n"
                + "  (4)\tPSI_2.phoneBookMap\n"
                + "  (5)\tPSI_2.factorial"
                );



        int continueProgram = 1;

        while (continueProgram == 1) {
            TableOfContents.tableOfContents();
            System.out.println("\n\n\n---------------------------------\n"
                    + "Press 1 to continue or 2 to quit."
                    + "\n---------------------------------");
            continueProgram = scanContinue.nextInt();
        }

        System.out.println("\n\n\n~~~~~~~~~\n~~~~~~~~~\n"
                + "Good-Bye!\n~~~~~~~~~\n~~~~~~~~~");


    }
}


