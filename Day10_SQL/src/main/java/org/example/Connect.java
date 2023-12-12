package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {

    public static Connection connect(){
        String url =  "jdbc:sqlite:/Users/livaieleja/Desktop/chinook.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Connection failed!");
        }
        return conn;
    }

    public static void readArtists(){
        String sql = "SELECT * FROM artists";

        try {
            Statement stm = new conn.createStatement();
            ResultSet rs = stm.getResultSet();

            while (rs.next()){
                System.out.println(rs.getString("Name"));
            }
        }catch(Exception e){
        }
    }
}
