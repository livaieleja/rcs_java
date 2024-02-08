package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Ievadiet darbinieka vārdu:");
        employee.firstName = scanner.nextLine();

        System.out.println("Ievadiet darbinieka uzvārdu:");
        employee.lastName = scanner.nextLine();

        System.out.println("Iedvadiet darbinieka darba stāžu:");
        employee.yearsWorked = scanner.nextInt();

        employee.displayInfo();
    }
}
