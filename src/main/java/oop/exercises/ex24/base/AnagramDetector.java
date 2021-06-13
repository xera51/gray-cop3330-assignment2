/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex24.base;

import java.util.Arrays;

public class AnagramDetector {

    /**
     * Compares two {@code String}s to see if they are anagrams
     * <p>An {@code IllegalArgumentException} is thrown if the arguments are
     * different lengths, disregarding whitespace
     * @param arg1 {@code String} to compare
     * @param arg2 {@code String} to compare
     * @return {@code true} if and only if the two strings are anagrams
     */
    public boolean isAnagram(String arg1, String arg2) {

        if(!sameLengthNoWhitespace(arg1, arg2)) {
            throw new IllegalArgumentException("Strings are different lengths");
        }

        char[] arg1CharArray = anagramCompareFormat(arg1);
        char[] arg2CharArray = anagramCompareFormat(arg2);

        return Arrays.equals(arg1CharArray, arg2CharArray);
    }


    private boolean sameLengthNoWhitespace(String arg1, String arg2) {
        return removeWhitespace(arg1).length() == removeWhitespace(arg2).length();
    }


    private char[] anagramCompareFormat(String str) {
        char[] out = removeWhitespace(str).toLowerCase().toCharArray();
        Arrays.sort(out);
        return out;
    }

    // Removes the whitespace from a String
    private String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

}
