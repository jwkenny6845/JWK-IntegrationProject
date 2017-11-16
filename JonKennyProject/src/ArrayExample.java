/**
 * JONATHAN KENNY
 * COP 2006 - FALL 2017
 * PROF. VANSELOW
 */

import java.util.*;


public class ArrayExample {

    public static void arrayExample() {

        //CREATES SCANNER OBJECT
        Scanner in = new Scanner(System.in);

        //SCANS IN LENGTH OF THE ARRAY
        int n = in.nextInt();

        //SCANS IN ARRAY ELEMENTS
        int[] testArray = new int[n];
        for(int i=0; i < n; i++){
            testArray[i] = in.nextInt();  
        }

        //PRINTS ARRAY IN REVERSE ORDER
        //AS A SINGLE LINE OF SPACE-SEPERATED NUBERS
        while(n > 0) {
            System.out.print(testArray[--n] + " ");
        }

        //CLOSES SCANNER OBJECT
        in.close();
    }
}
