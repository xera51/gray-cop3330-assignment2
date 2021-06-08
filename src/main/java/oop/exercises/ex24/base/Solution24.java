/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex24.base;

import java.util.Scanner;

public class Solution24 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        AnagramDetector detector = new AnagramDetector();

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        String input1 = readString("Enter the first string: ");
        String input2 = readString("Enter the second string: ");

        try {
            boolean isAnagram = detector.isAnagram(input1, input2);
            System.out.println(buildOutput(input1, input2, isAnagram));
        } catch (MismatchedLengthException e) {
            System.out.println("Inputs need to be the same length of non-whitespace characters");
        }
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    private static String buildOutput(String input1, String input2, boolean isAnagram) {
        return String.format("\"%s\" and \"%s\" are%s anagrams.", input1, input2,
                isAnagram ? "" : " not");
    }
}
