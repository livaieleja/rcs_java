package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet darbinieka vārdu:");
        String firstName = scanner.nextLine();

        System.out.println("Ievadiet darbinieka uzvārdu:");
        String lastName = scanner.nextLine();

        System.out.println("Iedvadiet darbinieka darba stāžu:");
        int yearsWorked = scanner.nextInt();;

        Employee employee = new Employee(firstName, lastName, yearsWorked);

        employee.displayInfo();
    }
}
