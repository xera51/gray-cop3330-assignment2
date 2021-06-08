package oop.exercises.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_identical_words() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "note");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_nonidentical_anagrams() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "tone");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_non_anagrams() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "nope");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_MismatchedLengthException_for_words_of_different_length() {
        AnagramDetector detector = new AnagramDetector();

        assertThrows(MismatchedLengthException.class, () -> detector.isAnagram("note", "not"));
    }
}