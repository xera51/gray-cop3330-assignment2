/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex24.base;

import java.util.Arrays;

public class AnagramDetector {

    public boolean isAnagram(String input1, String input2) {

        if(!isSameLengthNoWhitespace(input1, input2)) {
            throw new MismatchedLengthException("Strings are different lengths");
        }

        char[] inputAsChars1 = anagramCompareFormat(input1);
        char[] inputAsChars2 = anagramCompareFormat(input2);

        Arrays.sort(inputAsChars1);
        Arrays.sort(inputAsChars2);

        return Arrays.equals(inputAsChars1, inputAsChars2);
    }

    private boolean isSameLengthNoWhitespace(String input1, String input2) {
        return input1.replaceAll("\\s", "").length() ==
                input2.replaceAll("\\s", "").length();
    }

    // Removes whitespace, converts all letters to lowercase, and returns string as char array
    private char[] anagramCompareFormat(String input1) {
        return input1.replaceAll("\\s", "").toLowerCase().toCharArray();
    }

}
