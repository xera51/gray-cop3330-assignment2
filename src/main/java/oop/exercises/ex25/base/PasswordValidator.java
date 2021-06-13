/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex25.base;

public class PasswordValidator {

    /**
     * Evaluates the strength of a password
     * <p>Strength is evaluated as follows
     * <ul>
     *     <li>0 (very weak): Password is entirely numeric and less than 8 characters
     *     <li>1 (weak):<ul>
     *          <li>Password is entirely numeric and more than 8 characters
     *          <li>Password is less than 8 characters and not entirely numeric
     *     </ul>
     *     <li>2 (good):<ul>
     *         <li>Password contains only letters and is more than 8 characters
     *         <li>Password contains only special characters and is more than 8 characters
     *     </ul>
     *     <li>3 (strong): <ul>
     *         <li>Password contains at least one letter and at least one special character
     *         and is more than 8 characters
     *         <li>Password contains at least one letter and at least one number
     *         and is more than 8 characters
     *         <li>Password contains at least one special character and at least one number
     *         and is more than 8 characters
     *     </ul>
     *     <li>4 (very strong): Password contains at least one letter, one number, and
     *     one special character and is more than 8 characters</li>
     * </ul>
     *
     * @param password The password that is evaluated for its strength
     * @return The strength of the password as an {@code int}.
     *
     */
    public int passwordValidator(String password) {

        if(password.contains(" ")) {
            throw new IllegalArgumentException("Password cannot contain whitespace");
        }

        if(isNumeric(password) && password.length() < 8) {
            return 0;
        } else if (isNumeric(password) || password.length() < 8) {
            return 1;
        } else if (containsDigit(password) && containsSpecial(password) && containsLetter(password)) {
            return 4;
        } else if (containsDigit(password) || (containsLetter(password) && containsSpecial(password))) {
            return 3;
        } else {
            return 2;
        }
    }

    /**
     * Converts a password strength code from an {@code int} to a {@code String}.
     * <ul>
     * <li>0: very weak
     * <li>1: weak
     * <li>2: good
     * <li>3: strong
     * <li>4: very strong
     * </ul>
     *
     * @param code The strength of the password as an {@code int}
     * @return The strength of the password as a {@code String}
     * @see #passwordValidator
     */
    public String passwordCodeToString(int code) {
        return switch (code) {
            case 0:
                yield "very weak";
            case 1:
                yield "weak";
            case 2:
                yield "good";
            case 3:
                yield "strong";
            case 4:
                yield "very strong";
            default:
                throw new IllegalArgumentException("Invalid password strength code");
        };
    }


    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    private boolean containsDigit(String str) { return str.matches(".*\\d.*"); }

    private boolean containsLetter(String str) { return str.matches(".*\\p{L}.*"); }

    private boolean containsSpecial(String str) { return str.matches(".*[^\\p{LD}].*"); }
}
