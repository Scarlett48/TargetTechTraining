package com.aique.db.jdbc.pg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    private static final String sql = "INSERT INTO users" +
            "  (id, name, email, country, password) VALUES " +
            " (?, ?, ?, ?,?);";

    public static void main(String[] args) {
        try(Connection conn =  ConnectionFactory.getPGConnection();
        PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setInt(1, 2);
            ps.setString(2, "Willy");
            ps.setString(3, "willy@gmail.com");
            ps.setString(4, "USA");
            ps.setString(5,"secret");
            System.out.println(sql);
            ps.executeUpdate();
            System.out.println("inserted records into database");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
