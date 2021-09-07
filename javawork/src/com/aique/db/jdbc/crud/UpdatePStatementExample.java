package com.aique.db.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdatePStatementExample {

    private static final String UPDATE_USERS_SQL = "update users set name = ? where id = ?;";

    public static void main(String[] argv) throws SQLException {
        UpdatePStatementExample updateStatementExample = new UpdatePStatementExample();
        updateStatementExample.updateRecord();
    }

    public void updateRecord() throws SQLException {
        System.out.println(UPDATE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement ps = connection.prepareStatement(UPDATE_USERS_SQL)) {

            ps.setString(1, "Ram");
            ps.setInt(2, 1);

            // Step 3: Execute the query or update query
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
