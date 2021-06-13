/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex30.base;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();

        String table = app.buildMultiplicationTable();
        System.out.print(table);
    }

    public String buildMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                table.append(String.format("%5d", i * j));
            }
            table.append(String.format("%n"));
        }
        return table.toString();
    }
}
