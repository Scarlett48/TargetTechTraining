package com.aique.db.jdbc.h2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectPSExample {
    private static final String QUERY = "select id,name,email,country from users where id =?";

    public static void main(String[] args) {

        // using try-with-resources to avoid closing resources (boiler plate code)

        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement ps = connection.prepareStatement(QUERY);) {
            ps.setInt(1, 2);
            System.out.println(ps);
            // Step 3: Execute the query or update query
            ResultSet rs = ps.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                System.out.println(id + "," + name + "," + email + "," + country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Step 4: try-with-resource statement will auto close the connection.
    }
}
