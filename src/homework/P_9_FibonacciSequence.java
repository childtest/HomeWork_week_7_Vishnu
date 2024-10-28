package homework;

/* Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

public class P_9_FibonacciSequence {

    public static void main(String[] args) {

        int n = 15; // Number of Fibonacci numbers to print
        int first = 1; // First Fibonacci number
        int second = 1; // Second Fibonacci number

        System.out.print(first + " " + second + " "); // Print the first two numbers

        for (int i = 3; i <= n; i++) { // Start from the 3rd number
            int next = first + second; // Calculate the next Fibonacci number
            System.out.print(next + " "); // Print the next Fibonacci number
            first = second; // Update the first number
            second = next; // Update the second number
        }

    }
}
