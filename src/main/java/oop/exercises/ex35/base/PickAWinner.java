/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex35.base;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickAWinner {

    private static final Scanner in = new Scanner(System.in);
    private final ArrayList<String> entries = new ArrayList<>();

    public void readEntries() {
        while(true) {
            System.out.print("Enter a name: ");
            String entrant = in.nextLine();

            if(entrant.isEmpty()) break;
            else entries.add(entrant);
        }
    }

    public void pickAWinner() {
        Random random = new Random();
        String winner = entries.get(random.nextInt(entries.size()));
        System.out.printf("The winner is... %s%n", winner);
    }
}
