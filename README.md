# Data Structure and Algorithms in Java


## 1. Check if a number is a Palindrome

```java
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

```

## 2. Check if a String is a Palindrome

```java
package org.example;

import java.util.Scanner;

/**
 * The {@code PalindromeChecker} class provides a method to check
 * if a given string is a palindrome. A palindrome is a word, phrase,
 * number, or other sequences of characters that reads the same
 * forward and backward, ignoring spaces, punctuation, and capitalization.
 */
public class PalindromeChecker {

    /**
     * Checks if the given string is a palindrome.
     *
     * @param str the string to check
     * @return {@code true} if the string is a palindrome;
     *         {@code false} otherwise
     */
    public static boolean isPalindrome(String str) {
        int left = 0; //pointers
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * The main method serves as the entry point for the program.
     * It prompts the user to enter a string and checks if that
     * string is a palindrome.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        System.out.println("\"" + input + "\" is palindrome: " + result);
        scanner.close();
    }
}

```

## 3. Print Fibonacci Series

```java
package org.example;

/**
 * This class provides a method to print the Fibonacci series.
 */
public class Fibonacci {

    /**
     * Prints the Fibonacci series up to the specified number of terms.
     *
     * @param terms the number of terms to print
     */
    public static void printFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numberOfTerms = 10; // Change this value for more or fewer terms
        printFibonacci(numberOfTerms);
    }
}

```

## 4. Print the Second-Highest Number in an Array

```java
package org.example;

/**
 * Utility class to find the second-highest number in an integer array.
 */
public class SecondHighestFinder {

    /**
     * Finds and returns the second-highest number in an integer array.
     *
     * @param numbers the integer array
     * @return the second-highest number in the array
     * @throws IllegalArgumentException if the array has fewer than two elements
     */
    public static int findSecondHighest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        return secondHighest;
    }

    /**
     * Main method to test the findSecondHighest method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 8, 3, 8, 6}; //indicates the variable only takes an array of integer numbers
        System.out.println("The second highest number is: " + findSecondHighest(numbers));
    }
}
```

## 5. Reverse an Array

```java
package org.example;

/**
 * A class that provides a method to reverse an array of integers.
 */
public class ArrayReverser {

    /**
     * Reverses the given array of integers in place.
     *
     * @param numbers the array of integers to be reversed
     */
    public void reverseArray(int[] numbers) {
        int left = 0; // Starting index
        int right = numbers.length - 1; // Ending index

        // Swap elements until the middle of the array is reached
        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    /**
     * The main method to test the ArrayReverser class.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayReverser reverser = new ArrayReverser(); // Create an instance of ArrayReverser
        int[] numbers = {1, 5, 2, 8, 3, 8, 6}; // Initialize the array

        System.out.println("Original array:");
        printArray(numbers); // Print original array

        reverser.reverseArray(numbers); // Reverse the array

        System.out.println("Reversed array:");
        printArray(numbers); // Print reversed array
    }

    /**
     * Helper method to print the elements of the array.
     *
     * @param numbers the array of integers to be printed
     */
    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line after printing the array
    }
}

```