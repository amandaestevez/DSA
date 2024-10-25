package org.example;

/**
 * Utility class to find the second highest number in an integer array.
 */
public class SecondHighestFinder {

    /**
     * Finds and returns the second highest number in an integer array.
     *
     * @param numbers the integer array
     * @return the second highest number in the array
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
        int[] numbers = {1, 5, 2, 8, 3, 8, 6};
        System.out.println("The second highest number is: " + findSecondHighest(numbers));
    }
}
