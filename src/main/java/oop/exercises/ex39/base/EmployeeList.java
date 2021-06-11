/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex39.base;

import java.util.ArrayList;

public class EmployeeList {

    private final ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee newEmployee) {
        list.add(newEmployee);
    }

    public void displayEmployeesByLastName(){
        sortByLastName();
        displayEmployees();

    }

    public void displayEmployees() {
        displayTableHeader();
        for (Employee employee : list) {
            displayTableEntry(employee);
        }
    }

    private void displayTableHeader() {
        System.out.printf("%-20s| %-18s|%16s%n", "Name", "Position", "Separation Date");
        System.out.println("--------------------|-------------------|----------------");
    }

    private void displayTableEntry(Employee employee) {
        System.out.printf("%-20s| %-18s| %-15s%n", employee.getFullName(),
                employee.getPosition(), employee.getSeparationDate());
    }

    public void sortByLastName() {

        for(int i = 0; i < list.size() - 1; i++) {
            int swapIndex = i;
            Employee current = list.get(i);
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(j).getLastName().compareTo(current.getLastName()) < 0) {
                    current = list.get(j);
                    swapIndex = j;
                }
            }
            swap(i, swapIndex);
        }
    }

    private void swap(int index1, int index2) {
        Employee temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public void displayFilteredTable(String nameTerm) {
        displayTableHeader();
        for(Employee employee : list) {
            if(employee.getFirstName().contains(nameTerm) || employee.getLastName().contains(nameTerm)) {
                displayTableEntry(employee);
            }
        }
    }
}
