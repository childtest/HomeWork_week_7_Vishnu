package homework;

/* Write a program in Java to display the pattern like a diamond.
   While loop

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *    */

public class P_14_DiamondPattern {

    public static void main(String[] args) {

        int n = 7; // Height of the diamond

        int i = 0; // Row counter for the upper half
        // Upper half of the diamond
        while (i < n) {
            int j = 0; // count of spaces
            // Print spaces
            while (j < n - i - 1) {
                System.out.print(" ");
                j++;
            }

            int k = 0; // Column of stars
            // Print stars
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println(); // next line
            i++;
        }

        i = n - 2; // Row count of lower half
        // Lower half of the diamond
        while (i >= 0) {
            int j = 0; // count of spaces
            // Print spaces
            while (j < n - i - 1) {
                System.out.print(" ");
                j++;
            }

            int k = 0; //  count of stars
            // Print stars
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println(); //  next line
            i--;
        }
    }

}
