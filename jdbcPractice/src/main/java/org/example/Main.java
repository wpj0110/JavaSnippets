package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root",
                    "Lumalaon881+");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM city LIMIT 10");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}