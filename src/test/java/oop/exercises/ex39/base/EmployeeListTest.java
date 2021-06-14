/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex39.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    @DisplayName("Ex39: Table is generated correctly")
    void table_of_all_employees_is_generated_correctly_set1() {
        EmployeeList list = new EmployeeList();
        Main app = new Main();

        app.employeeEntries(list);

        String expected = String.format("Name                | Position          | Separation Date%n" +
                "--------------------|-------------------|----------------%n" +
                "Jacquelyn Jackson   | DBA               |                %n" +
                "Jake Jacobson       | Programmer        |                %n" +
                "John Johnson        | Manager           | 2016-12-31     %n" +
                "Michaela Michaelson | District Manager  | 2015-12-19     %n" +
                "Sally Weber         | Web Developer     | 2015-12-18     %n" +
                "Tou Xiong           | Software Engineer | 2016-10-05     %n");
        String actual = list.displayEmployeesByLastName();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Ex40: Table is generated correctly")
    void table_of_all_employees_is_generated_correctly_set2() {
        EmployeeList list = new EmployeeList();
        Main app = new Main();

        app.employeeEntries(list);

        String expected = String.format("Name                | Position          | Separation Date%n" +
                "--------------------|-------------------|----------------%n" +
                "Jacquelyn Jackson   | DBA               |                %n" +
                "Jake Jacobson       | Programmer        |                %n");
        String actual = list.displayFilteredTable("Jac");

        assertEquals(expected, actual);
    }
}