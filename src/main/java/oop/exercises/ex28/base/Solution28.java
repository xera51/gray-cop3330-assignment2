/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex28.base;

import java.util.Scanner;

public class Solution28 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int total = 0;
        for(int i = 0; i < 5; i++) {
            total += readNum();
        }
        System.out.println("The total is " + total + ".");
    }

    private static int readNum() {
        System.out.print("Enter a number: ");
        return in.nextInt();
    }
}
