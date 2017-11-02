import java.util.*;

///////////////////////////////  
// Jonathan Kenny - COP 2006 //  
///////////////////////////////  

public class TestWork {

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

  public static void main(String[] args) {
    int number = 7;
    // Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    int result = Factorial(number);
    System.out.println(number + "! = " + result);
  }
}
