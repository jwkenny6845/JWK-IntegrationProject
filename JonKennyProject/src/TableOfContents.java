import java.util.Scanner;

public class TableOfContents {
     
  
    //METHODS TOC SWITCH  
    public static void tableOfContents() {
 
      //INPUT SCANNER OBJECT:
      Scanner scan = new Scanner(System.in);  
      
      //METHOD SELECTOR PROMPT:
      int method = scan.nextInt();
      System.out.println("You picked Method: " + method);
      
      //METHOD INPUT PROMPT:
      System.out.println("Enter Number:");
      int userInput = scan.nextInt();


     switch (method) {
       case 1: 
            System.out.println(PSI_2.Factorial(userInput));
                break;
       case 2:  
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 3:  
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 4:  
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       case 5:  
                   System.out.println(PSI_2.Factorial(userInput));
                break;
       default: 
               System.out.println("OUT OF BOUNDS");
                break;
   }
    
     scan.close();
     
    }


     
}

