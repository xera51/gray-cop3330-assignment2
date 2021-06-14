/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex39.base;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeList {

    private final ArrayList<HashMap<String, String>> list = new ArrayList<>();

    public void addEmployee(String firstName, String lastName, String position, String separationDate) {

        HashMap<String, String> newEmployee = new HashMap<>();
        newEmployee.put("firstName", firstName);
        newEmployee.put("lastName", lastName);
        newEmployee.put("position", position);
        newEmployee.put("separationDate", separationDate);

        list.add(newEmployee);
    }

    public void addEmployee(String firstName, String lastName, String position) {
        addEmployee(firstName, lastName, position, "");
    }

    public String displayEmployeesByLastName(){
        sortByLastName();
        return displayEmployees();
    }

    public String displayEmployees() {
        StringBuilder output = new StringBuilder();
        output.append(displayTableHeader());
        for (HashMap<String, String> employee : list) {
            output.append(displayTableEntry(employee));
        }
        return output.toString();
    }

    private String displayTableHeader() {
        return String.format("%-20s| %-18s|%16s%n--------------------|-------------------|----------------%n"
                , "Name", "Position", "Separation Date");
    }

    private String displayTableEntry(HashMap<String, String> employee) {
        return String.format("%-20s| %-18s| %-15s%n", getFullName(employee),
                employee.get("position"), employee.get("separationDate"));
    }

    public void sortByLastName() {

        for(int i = 0; i < list.size() - 1; i++) {
            int swapIndex = i;
            HashMap<String, String> current = list.get(i);
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(j).get("lastName").compareTo(current.get("lastName")) < 0) {
                    current = list.get(j);
                    swapIndex = j;
                }
            }
            swap(i, swapIndex);
        }
    }

    private void swap(int index1, int index2) {
        HashMap<String, String> temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public String displayFilteredTable(String nameTerm) {
        sortByLastName();
        StringBuilder output = new StringBuilder();
        output.append(displayTableHeader());
        for(HashMap<String, String> employee : list) {
            if(employee.get("firstName").contains(nameTerm) || employee.get("lastName").contains(nameTerm)) {
                output.append(displayTableEntry(employee));
            }
        }
        return output.toString();
    }

    private String getFullName(HashMap<String, String> employee) {
        return employee.get("firstName") + " " + employee.get("lastName");
    }
}
