import java.util.Scanner;

/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

public class JonathanKenny_IntegrationProject {

    
    
    public void tableOfContents() {
     switch (method) {
       case 1: method = 1;
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 2:  method = 2;
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 3:  method = 3;
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 4:  method = 4;
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 5:  method = 5;
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       default: method > 5;
               System.out.println("OUT OF BOUNDS");
                break;
   }
    
     
     
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

     //INPUT SCANNER OBJECT:
     Scanner scan = new Scanner(System.in);
     
     
     
     //METHOD SELECTOR PROMPT:
     int method = scan.nextInt();
     System.out.println("You picked Method: " + method);
     
     //METHOD INPUT PROMPT:
     System.out.println("Enter Number:");
     int userInput = scan.nextInt();
     
     //METHODS TOC SWITCH
     
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
