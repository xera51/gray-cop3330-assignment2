package oop.exercises.utility;

import java.util.Scanner;

public class DataReader {

    private final Scanner in = new Scanner(System.in);

    public DataReader() { }

    /**
     * Prompts the user for an input, and returns the input the line they typed
     * into the console as a {@code String}
     * @param prompt {@code String} to be displayed as a prompt for the user
     * @return {@code String} value that the user typed to the console
     */
    public String readString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    /**
     * Prompts the user for an input, and returns the input the line they typed
     * into the console as a {@code int}
     * @param prompt {@code String} to be displayed as a prompt for the user
     * @return {@code int} value that the user typed to the console
     */
    public int readInt(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }

    /**
     * Prompts the user for an input, and returns the input the line they typed
     * into the console as a {@code int}
     * <p> If the user does not enter an {@code int}, the errorMessage is
     * printed to the console, and the user is prompted for input again.
     * The user will be continuously shown the errorMessage and prompt until
     * they enter a valid value
     * @param prompt {@code String} to be displayed as a prompt for the user
     * @param errorMessage {@code String} to be displayed when the user
     *                                   enters an erroneous value
     * @return {@code int} value that the user typed to the console
     */
    public int readIntValidated(String prompt, String errorMessage) {
        boolean continueLoop = true;
        int output = 0;

        while(continueLoop) {
            try {
                System.out.print(prompt);
                String input = in.nextLine();
                output = Integer.parseInt(input);
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return output;
    }

    /**
     * Prompts the user for an input, and returns the input the line they typed
     * into the console as a {@code double}
     * @param prompt {@code String} to be displayed as a prompt for the user
     * @return {@code double} value that the user typed to the console
     */
    public double readDouble(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }

    /**
     * Prompts the user for an input, and returns the input the line they typed
     * into the console as a {@code double}
     * <p> If the user does not enter an {@code double}, the errorMessage is
     * printed to the console, and the user is prompted for input again.
     * The user will be continuously shown the errorMessage and prompt until
     * they enter a valid value
     * @param prompt {@code String} to be displayed as a prompt for the user
     * @param errorMessage {@code String} to be displayed when the user
     *                                   enters an erroneous value
     * @return {@code double} value that the user typed to the console
     */
    public double readDoubleValidated(String prompt, String errorMessage) {
        boolean continueLoop = true;
        double output = 0;

        while(continueLoop) {
            try {
                System.out.print(prompt);
                String input = in.nextLine();
                output = Double.parseDouble(input);
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return output;
    }

}
