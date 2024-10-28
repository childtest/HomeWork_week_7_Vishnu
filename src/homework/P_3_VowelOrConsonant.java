package homework;

/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/

import java.util.Scanner;

public class P_3_VowelOrConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet : ");
        String text = scanner.nextLine();

        // check text is single character or not
        if (text.length() != 1){
            System.out.println(" Error : Please enter only a single character.");
            main(null);
        }else {
            char ch = text.charAt(0);

            // check is character latter or not
            if (Character.isLetter(ch)){

                ch = Character.toLowerCase(ch);

                // check character is vowel or not
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    System.out.println("Input latter is vowel");
                }else {
                    System.out.println("Input latter is consonant");
                }
            }else {
                System.out.println("Error : Please enter a valid latter (a-z or A-Z).");
                main(null);
            }
        }

        scanner.close();
    }
}
