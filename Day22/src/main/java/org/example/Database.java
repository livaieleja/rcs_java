package org.example;
import com.google.gson.Gson;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Employee> getEmployees() {
        String url = "jdbc:sqlite:/Users/livaieleja/Desktop/Kursi - RCS/JAVA/rcs_java/Day22/day22.db";
        List<Employee> employees = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT firstName, lastName, yearsWorked FROM employee");

            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getInt("yearsWorked"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return employees;
    }

    public static void convertListToJson() {
        List<Employee> employees = getEmployees();
        Gson gson = new Gson();
        String json = gson.toJson(employees);
        System.out.println(json);
    }
}

