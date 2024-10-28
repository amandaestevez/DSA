// Set up
// 1. Create Maven Project
package org.example; //2. Package declaration

import java.util.Scanner; //3. Import scanner to read user input

public class PalindromeChecker { //4. Class declaration
// Solution
    public static boolean isPalindrome(int number) { // 1. Create checker method.
        int originalNumber = number; // 2. Storage user input.
        int reversedNumber = 0;      // 3. Create pointer

        while (number != 0) {        // 4. Create a while loop to check user input.
            int digit = number % 10; // 5. Extract the last digit of 'number' and store it in the variable 'digit'
            reversedNumber = reversedNumber * 10 + digit;  // 6. Append 'digit' to the reversed number.
            number /= 10;  // 7. Remove the last digit from the original number
        }

        return originalNumber == reversedNumber; // 8. Check if 'originalNumber' and 'reversedNumber' are equal.
    }

    public static void main(String[] args) { // Final Step: Execute the program
        Scanner scanner = new Scanner(System.in); // 1. Instantiate the Scanner class
        System.out.print("Enter a number to check if it's a palindrome: "); // 2. Ask for user input
        int number = scanner.nextInt(); // 3. Store input into a variable 'number' that accepts only integers
        scanner.close(); // 4. Finalize the scanner instance.

        if (isPalindrome(number)) { // 5. Create the conditional that checks the 'isPalindrome' method's return.
            System.out.println(number + " is a palindrome."); // 6. Create the output for 'true'.
        } else {
            System.out.println(number + " is not a palindrome.");  // 7. Create the output for 'false'.
        }
    }
}
