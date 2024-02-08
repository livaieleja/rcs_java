package org.example;

public class Employee {
    String firstName;
    String lastName;
    int yearsWorked;

    public Employee(String firstName, String lastName, int yearsWorked) { //konstruktors
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsWorked = yearsWorked;
    }

    public void displayInfo() {
        System.out.println("Informācija par darbinieku: ");
        System.out.println("Vārds: " + firstName);
        System.out.println("Uzvārds: " + lastName);
        System.out.println("Darba stāžs: " + yearsWorked);
    }
}
