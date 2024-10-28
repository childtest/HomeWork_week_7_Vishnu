package homework;

/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered. -Before the user enters the number, print the message Enter number:  -If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:  -Use an endless while loop.
 -Create a class with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class P_2_MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 1;
        boolean first = true;

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Update min and max number
                if (first) {
                    min = number;
                    max = number;
                    first = false;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }
            } else {
                System.out.println("Invalid Number");
                break; // Exit loop
            }
            scanner.nextLine();
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        scanner.close(); // Close the scanner
    }

}
