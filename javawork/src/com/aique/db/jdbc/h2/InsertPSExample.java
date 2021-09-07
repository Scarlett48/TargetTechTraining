package com.aique.db.jdbc.h2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertPSExample {
    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (id, name, email, country) VALUES " +
        " (?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
        InsertPSExample psExample = new InsertPSExample();
        psExample.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement ps = connection.prepareStatement(INSERT_USERS_SQL)) {
            ps.setInt(1, 2);
            ps.setString(2, "Willy");
            ps.setString(3, "willy@gmail.com");
            ps.setString(4, "USA");

            System.out.println(ps);
            // Step 3: Execute the query or update query
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
