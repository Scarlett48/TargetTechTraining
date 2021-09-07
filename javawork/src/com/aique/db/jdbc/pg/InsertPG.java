package com.aique.db.jdbc.pg;

import com.aique.db.jdbc.crud.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertPG {
    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (id, name, email, country, password) VALUES " +
        " (?, ?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
        InsertPG insertPG = new InsertPG();
        insertPG.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection conn = JDBCUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_USERS_SQL)) {
            ps.setInt(1, 1);
            ps.setString(2, "Rock");
            ps.setString(3, "rock@gmail.com");
            ps.setString(4, "US");
            ps.setString(5, "secret");

            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
