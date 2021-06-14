/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex35.base;

import oop.exercises.utility.DataReader;

import java.util.ArrayList;
import java.util.Random;

public class PickAWinner {

    private final DataReader in = new DataReader();
    private final ArrayList<String> entries = new ArrayList<>();

    public void readEntries() {
        while(true) {
            String entrant = in.readString("Enter a name: ");

            if(entrant.isEmpty()) break;
            else entries.add(entrant);
        }
    }

    public void addEntry(String entrant) {
        entries.add(entrant);
    }

    public String pickAWinner() {
        Random random = new Random();
        String winner = entries.get(random.nextInt(entries.size()));
        return String.format("The winner is... %s.", winner);
    }
}
