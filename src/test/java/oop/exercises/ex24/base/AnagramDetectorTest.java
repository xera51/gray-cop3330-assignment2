/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex24.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    @DisplayName("Anagram: note and note")
    void isAnagram_returns_true_for_identical_words() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "note");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Anagram: note and tone")
    void isAnagram_returns_true_for_nonidentical_anagrams() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "tone");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Anagram: note and nope")
    void isAnagram_returns_false_for_non_anagrams() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "nope");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Anagram: note and not throws Exception")
    void isAnagram_returns_IllegalArgumentException_for_words_of_different_length() {
        AnagramDetector detector = new AnagramDetector();

        assertThrows(IllegalArgumentException.class, () -> detector.isAnagram("note", "not"));
    }
}