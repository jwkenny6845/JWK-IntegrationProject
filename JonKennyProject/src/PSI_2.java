
public class PSI_2 {

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

