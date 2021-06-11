package oop.exercises.ex39.base;

import java.util.HashMap;

public class Employee {

    private final HashMap<String, String> employeeData = new HashMap<>();

    public Employee(String firstName, String lastName, String position) {
        this(firstName, lastName, position, "");
    }

    public Employee(String firstName, String lastName, String position, String separationDate) {
        employeeData.put("firstName", firstName);
        employeeData.put("lastName", lastName);
        employeeData.put("position", position);
        employeeData.put("separationDate", separationDate);
    }

    public String getFirstName() {
        return employeeData.get("firstName");
    }

    public void setFirstName(String firstName) {
        employeeData.replace("firstName", firstName);
    }

    public String getLastName() {
        return employeeData.get("lastName");
    }

    public void setLastName(String lastName) {
        employeeData.replace("lastName", lastName);
    }

    public String getPosition() {
        return employeeData.get("position");
    }

    public void setPosition(String position) {
        employeeData.replace("position", position);
    }

    public String getSeparationDate() {
        return employeeData.get("separationDate");
    }

    public void setSeparationDate(String separationDate) {
        employeeData.replace("separationDate", separationDate);
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}
