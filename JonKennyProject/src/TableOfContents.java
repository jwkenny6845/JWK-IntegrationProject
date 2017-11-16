/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

import java.util.Scanner;

public class TableOfContents {

    //METHODS TOC SWITCH  
    public static void tableOfContents(Scanner scan) {

        //METHOD SELECTOR PROMPT:
        System.out.println("\n\n---------------------------------------\n"
                + "Enter a Method Number to call a Method:"
                + "\n---------------------------------------");
        int method = scan.nextInt();
        System.out.println("\nYou picked Method (" + method + ")");

        //METHOD INPUT PROMPT:
        System.out.println("Enter Number:");
        int userInput = scan.nextInt();

        switch (method) {
        //////////////////////////////////////////////////////////////////////    
        case 1: 
            System.out.println("\n\n" + userInput + "! = " 
                    + PSI_2.factorial(userInput));
            break;
        //////////////////////////////////////////////////////////////////////    
        case 2:  
            System.out.println("\n\n" + userInput 
                    + " + (all whole numbers less than " + userInput + ") = " 
                    + PSI_2.summation(userInput));
            break;
        //////////////////////////////////////////////////////////////////////    
        case 3:  
            System.out.println("\n\nIs " + userInput + " inbetween 10 and 20?"
                    + "\n\n" + PSI_2.inBetween10and20(userInput));
            break;
        //////////////////////////////////////////////////////////////////////            
        case 4:  
            System.out.println("\n\n" + userInput + "! = " 
                    + PSI_2.factorial(userInput));
            break;
        //////////////////////////////////////////////////////////////////////                
        case 5:  
            System.out.println("\n\n" + userInput + "! = " 
                    + PSI_2.factorial(userInput));
            break;
        //////////////////////////////////////////////////////////////////////    
        case 6:  
          System.out.println("\n\n" + userInput + "! = " 
                  + PSI_2.factorial(userInput));
          break;
        //////////////////////////////////////////////////////////////////////    
        case 7:  
          System.out.println("\n\n" + userInput + "! = " 
                  + PSI_2.factorial(userInput));
          break;
        //////////////////////////////////////////////////////////////////////    
        case 8:  
          System.out.println("\n\n" + userInput + "! = " 
                  + PSI_2.factorial(userInput));
          break;
        //////////////////////////////////////////////////////////////////////    
        case 9:  
          System.out.println("\n\n" + userInput + "! = " 
                  + PSI_2.factorial(userInput));
            break;
        //////////////////////////////////////////////////////////////////////            
        case 10:  
          System.out.println("\n\n" + userInput + "! = " 
                  + PSI_2.factorial(userInput));
          break;
        //////////////////////////////////////////////////////////////////////            
        default: 
            System.out.println("\n*!!!--METHOD (" + method 
                    + ") DOES NOT EXIST--!!!*");
            break;
        //////////////////////////////////////////////////////////////////////    
        }

    }

}
