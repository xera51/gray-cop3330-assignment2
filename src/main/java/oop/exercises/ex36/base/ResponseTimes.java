/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class ResponseTimes {

    private static final Scanner in = new Scanner(System.in);
    private ArrayList<Integer> responseTimes = new ArrayList<>();

    public void readResponseTimes() {
        String input;
        int responseTime = -1;
        boolean skip;

        while(true) {
            skip = false;
            System.out.print("Enter a number: ");
            input = in.nextLine();

            if(input.equalsIgnoreCase("done")) {
                break;
            } else {
                try {
                    responseTime = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    skip = true;
                }
            }
            if(!skip) {
                responseTimes.add(responseTime);
            }
        }
    }

    public void displayStatistics() {
        displayResponseTimes();
        System.out.printf("The average is %.1f%n", average());
        System.out.printf("The minimum is %d%n", min());
        System.out.printf("The maximum is %d%n", max());
        System.out.printf("The standard deviation is %.2f%n", std());
    }

    public void displayResponseTimes() {
        System.out.print("Numbers: ");
        for(int i = 0; i < responseTimes.size(); i++) {
            System.out.print(responseTimes.get(i));
            if(i == responseTimes.size() - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }

    public double average() {
        double total = 0;
        for(int time : responseTimes) {
            total += time;
        }
        return total / responseTimes.size();
    }

    public int min() {
        int min = responseTimes.get(0);
        for(int time : responseTimes) {
            if(time < min) min = time;
        }
        return min;
    }

    public int max() {
        int max = responseTimes.get(0);
        for(int time : responseTimes) {
            if(time > max) max = time;
        }
        return max;
    }

    public double std() {
        double temp = 0;
        double mean = average();
        for(int time : responseTimes) {
            temp += Math.pow(time - mean, 2);
        }
        temp /= responseTimes.size();
        return Math.sqrt(temp);
    }

    public void setResponseTimes(ArrayList<Integer> list) {
        responseTimes = list;
    }
}
