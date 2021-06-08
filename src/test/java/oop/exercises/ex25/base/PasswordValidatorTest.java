package oop.exercises.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void password_is_validated_as_very_weak() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(0, validator.passwordValidator("12345"));
    }

    @Test
    void password_is_validated_as_weak() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(1, validator.passwordValidator("abcdef"));
    }

    @Test
    void password_is_validated_as_good() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(2, validator.passwordValidator("abcdefgh"));
    }

    @Test
    void password_is_validated_as_strong() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(3, validator.passwordValidator("abc123xyz"));
    }

    @Test
    void password_is_validated_as_very_strong() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(4, validator.passwordValidator("1337h@xor!"));
    }

    @Test
    void password_with_space_throws_IllegalArgumentException() {
        PasswordValidator validator = new PasswordValidator();
        assertThrows(IllegalArgumentException.class, () -> validator.passwordValidator("a b c"));
    }
}