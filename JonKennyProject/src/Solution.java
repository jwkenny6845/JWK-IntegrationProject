import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    
    // HOURGLASS SUMMATION CODE GOES HERE
    int hourglassSum[] = new int[16];
    int h = 0;
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {
        hourglassSum[h] = 
              (arr[row][col] + arr[row][col + 1] + arr[row][col + 2]) 
            + (arr[row + 1][col + 1]) 
            + (arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]);
        h++;
      }
    }
    Arrays.sort(hourglassSum);
    System.out.println(hourglassSum[15]);
    System.out.println(hourglassSum[14]);
    System.out.println(hourglassSum[13]);
    System.out.println(hourglassSum[12]);
    System.out.println(hourglassSum[11]);
    System.out.println(hourglassSum[10]);
    System.out.println(hourglassSum[9]);
    System.out.println(hourglassSum[8]);
    System.out.println(hourglassSum[7]);
    System.out.println(hourglassSum[6]);
    System.out.println(hourglassSum[5]);
    System.out.println(hourglassSum[4]);
    System.out.println(hourglassSum[3]);
    System.out.println(hourglassSum[2]);
    System.out.println(hourglassSum[1]);
    System.out.println(hourglassSum[0]);

  }

}
