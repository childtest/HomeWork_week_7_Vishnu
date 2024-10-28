package homework;

/*Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint:
Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
Create a class with the name DigitSumChallenge. */


import java.util.Scanner;

public class P_4_DigitSumChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumDigits(number);

            if (result == -1) {
                System.out.println("Invalid input. Please enter a number 10 or greater.");
                main(null);
            } else {
                System.out.println("The sum of the digits is: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            main(null);
        }

        scanner.close();

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1; // Return -1
        }

        int sum = 0;

        // Loop to extract each digit and add to sum
        while (number > 0) {
            sum += number % 10; // Add the last digit to the sum
            number = number / 10; // Remove the last digit
        }

        return sum;
    }

}
