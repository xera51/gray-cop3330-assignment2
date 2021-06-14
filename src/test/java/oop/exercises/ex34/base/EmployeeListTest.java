/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex34.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    @DisplayName("List of names formatted correctly")
    void list_is_formatted_correctly() {
        EmployeeList list = new EmployeeList();

        String expected = String.format("There are 5 employees:%n" +
                "John Smith%n" +
                "Jackie Jackson%n" +
                "Chris Jones%n" +
                "Amanda Cullen%n" +
                "Jeremy Goodwin%n");
        String actual = list.buildEmployeeList();

        assertEquals(expected, actual);
    }
}