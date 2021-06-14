/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex38.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numberArray = readInts();
        displayEvenArray(numberArray);
    }

    // No meaningful class out of these functions, left it in the driver class
    // Functions needed to be public for testing
    public static void displayEvenArray(int[] numbers) {
        numbers = filterEvenNumbers(numbers);
        System.out.print("The even numbers are");

        for(int number : numbers) {
            System.out.printf(" %d", number);
        }
        System.out.println(".");
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int number : numbers) {
            if(number % 2 == 0) {
                evenList.add(number);
            }
        }

        // Convert from ArrayList to array of primitive type int
        int[] evenArray = new int[evenList.size()];

        for(int i = 0; i < evenArray.length; i++) {
            evenArray[i] = evenList.get(i);
        }

        return evenArray;
    }

    public static int[] readInts() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userInput = in.nextLine();
        String[] userNumbers = userInput.split(" ");

        // String array to integer array
        int[] numberArray = new int[userNumbers.length];

        try {
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = Integer.parseInt(userNumbers[i]);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Only numbers can be entered");
        }

        return numberArray;
    }
}
