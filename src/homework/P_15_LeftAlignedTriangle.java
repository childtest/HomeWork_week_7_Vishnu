package homework;

/* Display left angle triangle of * using nested for loops
*/

public class P_15_LeftAlignedTriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) { // Outer loop for each row
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
