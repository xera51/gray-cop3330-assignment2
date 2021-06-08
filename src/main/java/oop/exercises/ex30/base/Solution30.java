/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex30.base;

public class Solution30 {

    public static void main(String[] args) {
        displayMultiplicationTable();
    }

    private static void displayMultiplicationTable() {
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }
}
