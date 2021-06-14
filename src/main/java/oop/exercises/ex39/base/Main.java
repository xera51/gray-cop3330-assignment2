/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex39.base;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();

        EmployeeList list = new EmployeeList();

        app.employeeEntries(list);
        String output = list.displayEmployeesByLastName();
        System.out.print(output);
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
