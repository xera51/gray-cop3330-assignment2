/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex25.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    @DisplayName("very weak password")
    void password_is_validated_as_very_weak() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(0, validator.passwordValidator("12345"));
    }

    @Test
    @DisplayName("weak password")
    void password_is_validated_as_weak() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(1, validator.passwordValidator("abcdef"));
    }

    @Test
    @DisplayName("good password")
    void password_is_validated_as_good() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals( 2, validator.passwordValidator("abcdefgh"));
    }

    @Test
    @DisplayName("strong password")
    void password_is_validated_as_strong() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(3, validator.passwordValidator("abc123xyz"));
    }

    @Test
    @DisplayName("very strong password")
    void password_is_validated_as_very_strong() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(4, validator.passwordValidator("1337h@xor!"));
    }

    @Test
    @DisplayName("invalid password")
    void password_with_space_throws_IllegalArgumentException() {
        PasswordValidator validator = new PasswordValidator();
        assertThrows(IllegalArgumentException.class, () -> validator.passwordValidator("a b c"));
    }
}