package com.example.day232;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int yearsWorked;

    public Employee(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.yearsWorked = 0;
    }

    public Employee(int id, String firstName, String lastName, int yearsWorked) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsWorked = yearsWorked;
    }
}

