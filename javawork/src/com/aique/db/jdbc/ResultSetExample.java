package com.aique.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {

    public static void main(String[] args) {
        String username = "myusername";
        String password = "mypassword";
        String databaseName = "albums";

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load the MySQL driver.
            Class.forName("com.mysql.jdbc.Driver");


            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
                    + databaseName + "?"
                    + "user=" + username
                    + "&password=" + password);

            // Create the statement to be used to get the results.
            stmt = conn.createStatement();

            // Create a query to use.
            String query = "SELECT * FROM the_classics ORDER BY year";

            // Execute the query and get the result set, which contains
            // all the results returned from the database.
            ResultSet resultSet = stmt.executeQuery(query);


            while (resultSet.next()) {
                System.out.println("Printing result...");

                // Now we can fetch the data by column name, save and use them!
                String albumName = resultSet.getString("name");
                String artist = resultSet.getString("artist");
                int year = resultSet.getInt("year");

                System.out.println("\tAlbum: " + albumName + 
                        ", by Artist: " + artist + 
                        ", released in: " + year);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
