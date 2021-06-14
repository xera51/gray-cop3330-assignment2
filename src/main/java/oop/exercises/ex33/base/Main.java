/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex33.base;

public class Main {

    private final Magic8Ball ball = new Magic8Ball();

    public static void main(String[] args) {
        Main app = new Main();

        String response = app.ball.shakeBall();
        System.out.println(response);
    }
}
