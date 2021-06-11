/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex39.base;

public class Solution39 {

    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();

        employeeEntries(list);
        list.displayEmployeesByLastName();
    }

    public static void employeeEntries(EmployeeList list) {
        list.addEmployee(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        list.addEmployee(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        list.addEmployee(new Employee("Michaela",	"Michaelson", "District Manager", "2015-12-19"));
        list.addEmployee(new Employee("Jake", "Jacobson",	"Programmer"));
        list.addEmployee(new Employee("Jacquelyn", "Jackson",	"DBA"));
        list.addEmployee(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));
    }
}
