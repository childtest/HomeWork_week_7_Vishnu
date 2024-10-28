package homework;

/* Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@*/

public class P_8_RightAngleTriangle {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print("@"); // Print @ for each column
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
