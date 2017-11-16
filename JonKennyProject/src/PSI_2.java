/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

public class PSI_2 {

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
  
    static int factorial(int number) {

        //////////////
        // BASE CASE:
        if (number == 1) {
            return 1;
        }
        ///////////////////
        // RECURSIVE CASE:
        else {
            return number * factorial(number - 1);
        }

    }

    public static int summation(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static String inBetween10and20(int number) {

        if (10 < number &&  20 > number) {
            return "   YES, " + number + " is inbetween 10 and 20";
        }
        else {
            return "   NO, " + number + " is not inbetween 10 and 20";
        }

    }
    
}

