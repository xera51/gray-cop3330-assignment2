/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex34.base;

public class Main {

    private final EmployeeList employeeList = new EmployeeList();

    public static void main(String[] args) {
        Main app = new Main();


        String list = app.employeeList.buildEmployeeList();
        System.out.println(list);

        app.employeeList.removeEmployee();

        list = app.employeeList.buildEmployeeList();
        System.out.println(list);
    }
}
