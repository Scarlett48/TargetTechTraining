package com.aique.db.jdbc.h2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateExample {

    private static final String createUserTableSql =  "CREATE TABLE   USERS " +
            "(ID INTEGER not NULL, " +
            " NAME VARCHAR(255), " +
            " EMAIL VARCHAR(255), " +
            " COUNTRY VARCHAR(255), " +
            " PRIMARY KEY ( ID ))";

    static String createStudentTableSql =  "CREATE TABLE   STUDENT " +
            "(id INTEGER not NULL, " +
            " firstName VARCHAR(255), " +
            " lastName VARCHAR(255), " +
            " age INTEGER, " +
            " PRIMARY KEY ( id ))";

    public static void main(String[] argv) throws SQLException {
    	CreateExample ce = new CreateExample();
        ce.createTable(createUserTableSql);
    }

    public void createTable(String sql) throws SQLException {

        System.out.println(sql);
        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getConnection();
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
