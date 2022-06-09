package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        try (           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root",
                "Lumalaon881+");

                         Statement statement = connection.createStatement();

                         ResultSet resultSet = statement.executeQuery("SELECT * FROM city LIMIT 10");
                         ) //putting this within the "try" parenthesis will close the connections automatically.
        {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}