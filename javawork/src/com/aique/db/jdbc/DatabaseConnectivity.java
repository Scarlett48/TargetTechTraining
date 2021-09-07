package com.aique.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnectivity {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";
    static final  String USER ="sa";
    static final  String PASS ="";

    static String createStudentTableSql =  "CREATE TABLE   STUDENT " +
            "(id INTEGER not NULL, " +
            " firstName VARCHAR(255), " +
            " lastName VARCHAR(255), " +
            " age INTEGER, " +
            " PRIMARY KEY ( id ))";

    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
             Class.forName(JDBC_DRIVER);
             conn= DriverManager.getConnection(DB_URL,USER,PASS);
             System.out.println("Connection created successfully");
             stmt = conn.createStatement();
             System.out.println("Statement created successfully");
             //work with database by using these two objects
            //stmt.execute(createStudentTableSql);

//            String sql = "INSERT INTO STUDENT VALUES (100, 'Zara', 'Ali', 18)";
//
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO STUDENT VALUES (101, 'Mohit', 'Agrawal', 25)";
//
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO STUDENT VALUES (102, 'Zaid', 'Khan', 24)";
//
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO STUDENT VALUES(103, 'John', 'Doe', 28)";
//            String sql = "UPDATE Student " + "SET age = 30 WHERE id in (100, 101)";
            String sql = "DELETE FROM Student " + "WHERE firstName = 'Zara'";

            stmt.executeUpdate(sql);
            System.out.println("Executed query...");

            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
