/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex40.base;

import oop.exercises.ex39.base.EmployeeList;

import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main app = new Main();
        EmployeeList list = new EmployeeList();

        app.employeeEntries(list);
        list.sortByLastName();

        String searchTerm = readSearch();
        System.out.printf("%nResults:%n%n");
        String output = list.displayFilteredTable(searchTerm);
        System.out.print(output);
    }

    private static String readSearch() {
        System.out.print("Enter a search string: ");
        return in.nextLine();
    }

    public void employeeEntries(EmployeeList list) {
        list.addEmployee("John", "Johnson", "Manager", "2016-12-31");
        list.addEmployee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        list.addEmployee("Michaela",	"Michaelson", "District Manager", "2015-12-19");
        list.addEmployee("Jake", "Jacobson",	"Programmer");
        list.addEmployee("Jacquelyn", "Jackson",	"DBA");
        list.addEmployee("Sally", "Weber", "Web Developer", "2015-12-18");
    }


}
