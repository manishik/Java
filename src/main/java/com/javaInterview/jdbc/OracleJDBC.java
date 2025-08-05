package com.javaInterview.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {

    public static void main(String[] argv) {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;
        Statement statement = null;

        try {
            //connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCLPDB1", "SYS as SYSDBA", "Mypassword11");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCLPDB1", "Manish", "manish11");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        String queryListALLTableSQL = "SELECT * from TABS";
        //String queryListALLTableSQL = "SELECT * from USER_TABLES";

        try {
            if (connection != null) {
                System.out.println("Connected to Oracle database...");
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(queryListALLTableSQL);
                System.out.println("Listing all tables for the Oracle database user:");
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
            } else {
                System.out.println("Failed to connect to Oracle database!");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}
