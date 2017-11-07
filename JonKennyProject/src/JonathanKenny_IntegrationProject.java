import java.util.Scanner;

/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

public class JonathanKenny_IntegrationProject {

  // HEADER:
  public static void main(String[] args) {
    System.out.println("Welcome to Jonathan Kenny's Integration Project:");
    System.out.println("A portfolio of things learned in COP 2006");
    System.out.println();
    System.out.println("METHODS AVAILABLE TO CALL:");
    System.out.println("PSI_1.method");
    System.out.println("PSI_2.ifelse");
    System.out.println("PSI_2.whileloop");
    System.out.println("PSI_2.forloop");
    System.out.println("PSI_2.relationaloperators");
    System.out.println("PSI_2.conditionaloperators");
    System.out.println("PSI_2.class");
    System.out.println("PSI_2.array");
    System.out.println("PSI_3.method");
    System.out.println();
    System.out.println("Enter a Method name to Call the Method:");


     Scanner scan = new Scanner(System.in);
     int input = scan.nextInt();
     System.out.println("You picked Method: " + input);
     
     System.out.println("Enter Number");
     int number = scan.nextInt();

 
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
         
     
     scan.close();
    
    /////////////////
    // PSI_1.method();
    /////////////////
     // PSI_2.apple();
     // PSI_2.ifelse();
    // PSI_2.switch();
    // PSI_2.whileloop();
    // PSI_2.forloop();
    // PSI_2.relationaloperators();
    // PSI_2.conditionaloperators();
    // PSI_2.class();
    // PSI_2.array();
    /////////////////
    // PSI_3.method();
		
		
  }

	
	
	
}


