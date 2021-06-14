/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex34.base;

import oop.exercises.utility.DataReader;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList {

    private static final DataReader in = new DataReader();
    private static final ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson",
            "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

    public String buildEmployeeList() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("There are %d employees:%n", employeeList.size()));
        for(String employee : employeeList) {
            output.append(String.format("%s%n", employee));
        }
        return output.toString();
    }

    public void removeEmployee() {
        String remove = in.readString("Enter an employee name to remove: ");
        employeeList.remove(remove);
        System.out.println();
    }

}
