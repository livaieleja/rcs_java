package org.example;

public class Employee {
    String firstName;
    String lastName;
    int yearsWorked;

    public void displayInfo() {
        System.out.println("Informācija par darbinieku: ");
        System.out.println("Vārds: " + firstName);
        System.out.println("Uzvārds: " + lastName);
        System.out.println("Darba stāžs: " + yearsWorked);
    }
}
