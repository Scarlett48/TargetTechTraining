package com.aique.db.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateStatementExample {

    private static final String createTableSQL =
            "create table users ("
            + "  id  int(3) primary key,"
            + "  name varchar(20),"
            + "  email varchar(20),"
            + "  country varchar(20),"
            +"  password varchar(20)"
            + "  );";

    public static void main(String[] argv) throws SQLException {
        CreateStatementExample createTableExample = new CreateStatementExample();
        createTableExample.createTable();
    }

    public void createTable() throws SQLException {

        System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
