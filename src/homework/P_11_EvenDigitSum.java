package homework;

/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static*/

public class P_11_EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(2468));
    }

    public static int getEvenDigitSum(int number) {
        // Check for negative number
        if (number < 0) {
            return -1;
        }

        int sum = 0; //  sum of even digits

        // Convert the number to a string to process each digit
        String numberStr = Integer.toString(number);

        // Loop through each character in the string representation of the number
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar); // Convert character to digit
            if (digit % 2 == 0) { // Check if the digit is even
                sum += digit; // Add the even digit to the sum
            }
        }

        return sum; // Return the sum of even digits
    }
}
