package com.aique.db.jdbc.pg;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresConnection {
    private static  final String url = "jdbc:postgresql://localhost:5432/test";
    private static  final String user ="postgres";
    private static  final String password = "Admin@123";
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("successfully connected to postgres database.....");
    }


}
