# Data Structure and Algorithms in Java


## 1. Check if a number is a Palindrome

```java
package org.example;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
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