package oop.exercises.ex33.base;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    private static final String[] RESPONSES = {"Yes.", "No.", "Maybe.", "Ask again later."};
    private static final Scanner in = new Scanner(System.in);

    public void shakeBall() {
        System.out.printf("What is your question?%n> ");
        in.nextLine();
        System.out.println();

        Random generator = new Random();
        System.out.println(RESPONSES[generator.nextInt(4)]);
    }
}
