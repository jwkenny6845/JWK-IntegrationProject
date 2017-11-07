
public class PSI_2 {


    static int Factorial(int number) {

      ///////////////////////////////////////////
      // BASE CASE:
      if (number == 1) {
        return 1;
      }

      // RECURSIVE CASE:
      else {
        return number * Factorial(number - 1);
      }
      ///////////////////////////////////////////
      
    }

    public static void multiply() {
      int number = 7;
      // Scanner in = new Scanner(System.in);
      // int n = in.nextInt();
      int result = Factorial(number);
      System.out.println(number + "! = " + result);
    }
  }

  



/**
 * An if else statement
 * 
 * A switch statement
 * 
 * while loop
 * 
 * for loop
 * 
 * relational operators
 * 
 * conditional operators
 * 
 * class (A class with fields that are all private and a public get and set for each field)
 * 
 * array (Code that manually finds smallest, gets sum, and identifies index where value was found)
 */