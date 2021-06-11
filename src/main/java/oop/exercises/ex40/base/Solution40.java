/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex40.base;

import oop.exercises.ex39.base.EmployeeList;

import java.util.Scanner;

import static oop.exercises.ex39.base.Solution39.employeeEntries;

public class Solution40 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();

        employeeEntries(list);
        list.sortByLastName();

        String searchTerm = readSearch();
        System.out.printf("%nResults:%n%n");
        list.displayFilteredTable(searchTerm);
    }

    private static String readSearch() {
        System.out.print("Enter a search string: ");
        return in.nextLine();
    }
}
