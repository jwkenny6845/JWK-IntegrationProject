import java.util.Scanner;

public class IntegrationTwo {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter some text");
        System.out.println("Do it here:");
        String input = scan.nextLine();

        while (input != "") {

            System.out.println("This was my input: " + input);

        }

        // for int
        // int num= scan.nextInt();
        // System.out.println(num);

    }
}