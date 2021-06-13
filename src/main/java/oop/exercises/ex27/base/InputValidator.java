/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex27.base;

public class InputValidator {

    /**
     * Evaluates an employees data to see if that data is valid
     *
     * @param first First name of the employee
     * @param last Last name of the employee
     * @param zip Zip code of the employee
     * @param id ID of the employee
     * @return A {@code String} containing all error messages, or a {@code String}
     * stating that there were no errors
     */
    public String validateInput(String first, String last, String zip, String id) {
        String output = "";

        if(!filledValidation(first)) {
            output += String.format("The first name must be filled in.%n");
        } else if(!lengthValidation(first, 2)) {
            output += String.format("\"%s\" is not a valid first name. It is too short.%n", first);
        }

        if(!filledValidation(last)) {
            output += String.format("The last name must be filled in.%n");
        } else if(!lengthValidation(last, 2)) {
            output += String.format("\"%s\" is not a valid last name. It is too short.%n", last);
        }

        if(!isNumeric(zip)) {
            output += String.format("The ZIP code must be numeric.%n");
        }

        if(!idValidation(id)) {
            output += String.format("%s is not a valid ID.%n", id);
        }
        if(output.isEmpty()) {
            return "There were no errors found.";
        }

        return stripTrailingLineSeparator(output);
    }

    private boolean filledValidation(String str) {
        return !str.isEmpty();
    }

    private boolean lengthValidation(String str, int length) {
        return str.length() >= length;
    }

    private boolean idValidation(String str) {
        return str.matches("^[A-Za-z]{2}-[0-9]{4}$");
    }

    private boolean isNumeric(String str) {
        return str.matches("^[0-9]+$");
    }

    private String stripTrailingLineSeparator(String str) {
        return str.substring(0, str.length() - System.lineSeparator().length());
    }
}
