/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex24.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();
    private final AnagramDetector detector = new AnagramDetector();

    public static void main(String[] args) {
        Main app = new Main();

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String input1 = app.in.readString("Enter the first string: ");
        String input2 = app.in.readString("Enter the second string: ");

        app.findAnagram(input1, input2);
    }

    private void findAnagram(String arg1, String arg2) {
        try {
            boolean isAnagram = detector.isAnagram(arg1, arg2);
            String output = buildOutputString(arg1, arg2, isAnagram);
            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println("Inputs need to be the same length of non-whitespace characters");
        }
    }

    private String buildOutputString(String arg1, String arg2, boolean isAnagram) {
        return String.format("\"%s\" and \"%s\" are%s anagrams.",
                arg1, arg2, isAnagram ? "" : " not");
    }
}
