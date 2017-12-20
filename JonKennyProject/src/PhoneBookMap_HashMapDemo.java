/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMap_HashMapDemo {

  // --PHONEBOOK MAP METHOD-- //
  /**
   * Phone Book Map.
   */
  public static void phoneBookMap() {

    // INITIALIZES: PHONEBOOK HASHMAP
    Map<String, Integer> phoneBook = new HashMap<String, Integer>();

    // INITIALIZES: INPUT SCANNER
    Scanner scan = new Scanner(System.in);

    // DECLARES: VARIABLES
    String name;
    int phone;

    // SCANS IN: ALL TEST INPUT USING A LOOP
    int numEntries = scan.nextInt();
    for (int entry = 0; entry < numEntries; entry++) {
      name = scan.next();
      phone = scan.nextInt();
      phoneBook.put(name, phone);
    }

    // DECLARES: VARIABLE
    String testCase;

    // PRINTS OUT: ALL RECORDS FOR TEST INPUT SUBMITTED
    while (scan.hasNext()) {
      testCase = scan.next();
      System.out.println((phoneBook.get(testCase) != null)
          ? testCase + "=" + phoneBook.get(testCase) : "Not found");
    }

    // CLOSES: SCANNER OBJECT
    scan.close();
  }
}