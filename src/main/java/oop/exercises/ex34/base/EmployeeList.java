/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex34.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeList {

    private static final Scanner in = new Scanner(System.in);
    private static final ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson",
            "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

    public void displayEmployeeList() {
        System.out.printf("There are %d employees:%n", employeeList.size());
        for(String employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public void removeEmployee() {
        System.out.print("Enter an employee name to remove: ");
        String remove = in.nextLine();
        employeeList.remove(remove);
        System.out.println();
    }
}
