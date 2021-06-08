/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex27.base;

public class InputValidator {

    public String validateInput(String first, String last, String zip, String id) {
        String output = "";
        boolean error = false;

        if(!filledValidation(first)) {
            output += "The first name must be filled in.  ";
            error = true;
        } else if(!lengthValidation(first, 2)) {
            output += String.format("\"%s\" is not a valid first name. It is too short.  ", first);
            error = true;
        }
        if(!filledValidation(last)) {
            output += "The last name must be filled in.  ";
            error = true;
        } else if(!lengthValidation(last, 2)) {
            output += String.format("\"%s\" is not a valid last name. It is too short.  ", last);
            error = true;
        }
        if(!isNumeric(zip)) {
            output += "The ZIP code must be numeric.  ";
            error = true;
        }
        if(!idValidation(id)) {
            output += String.format("%s is not a valid ID.  ", id);
            error = true;
        }
        if(!error) {
            return "There were no errors found.";
        }
        return String.format(output.stripTrailing().replace("  ", "%n"));
    }

    private boolean filledValidation(String input) {
        return !input.isEmpty();
    }

    private boolean lengthValidation(String input, int length) {
        return input.length() >= length;
    }

    private boolean idValidation(String input) {
        return input.matches("^[A-Za-z]{2}-[0-9]{4}$");
    }

    private boolean isNumeric(String input) {
        return input.matches("^[0-9]+$");
    }
}
