package com.aique.db.jdbc.pg;

import com.aique.db.jdbc.crud.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePG {

    private static final String sql =  "CREATE TABLE   USERS " +
            "(ID INTEGER NOT NULL , " +
            " NAME VARCHAR(255), " +
            " EMAIL VARCHAR(255), " +
            " COUNTRY VARCHAR(255), " +
            " PASSWORD VARCHAR(255), " +
            " PRIMARY KEY ( ID ))";


    public static void main(String[] argv) throws SQLException {
        CreatePG ce = new CreatePG();
        ce.create(sql);
    }

    public void create(String sql) throws SQLException {

        System.out.println(sql);
        try (Connection conn = JDBCUtils.getConnection();
             Statement statement = conn.createStatement();) {

            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
