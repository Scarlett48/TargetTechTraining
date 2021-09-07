package com.aique.db.jdbc.pg;

import org.apache.commons.dbcp2.DelegatingPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    private static final String sql =  "CREATE TABLE   USERS " +
            "(ID INTEGER NOT NULL, " +
            " NAME VARCHAR(255), " +
            " EMAIL VARCHAR(255), " +
            " COUNTRY VARCHAR(255), " +
            " PASSWORD VARCHAR(255), " +
            " PRIMARY KEY ( ID ))";

    public static void main(String[] args) {
        try(Connection conn = ConnectionFactory.getPGConnection();
            Statement stmt = conn.createStatement();){
            stmt.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
