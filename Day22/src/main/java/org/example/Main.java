package org.example;
import com.google.gson.Gson;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Database.getEmployees();
        String json = Database.convertListToJson(employees);
        System.out.println(json);
    }
}

    //Scanner scanner = new Scanner(System.in);

        //System.out.println("Ievadiet darbinieka vārdu:");
        //String firstName = scanner.nextLine();

        //System.out.println("Ievadiet darbinieka uzvārdu:");
        //String lastName = scanner.nextLine();

        //System.out.println("Iedvadiet darbinieka darba stāžu:");
        // int yearsWorked = scanner.nextInt();;

        //Employee employee = new Employee(firstName, lastName, yearsWorked);

        //employee.displayInfo();

