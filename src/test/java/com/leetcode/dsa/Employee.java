package com.leetcode.dsa;

public class Employee extends Object {
    private String employee_name;
    private int employee_age;
    private int emp_grade;

    //constructor
    public Employee(String employee_name, int employee_age,int emp_grade) {
        this.employee_name = employee_name;
        this.employee_age = employee_age;
        this.emp_grade=emp_grade;
    }

    //getters
    public String getEmployee_name() {
        return employee_name;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    //setters
    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    //Overriding tostring() for easy printing of the class
    @Override
    public String toString() {
        return "Employee{" +
                "employee_name='" + employee_name + '\'' +
                ", employee_age=" + employee_age +
                ", employee_grade=" + emp_grade +
                '}';
    }
}

