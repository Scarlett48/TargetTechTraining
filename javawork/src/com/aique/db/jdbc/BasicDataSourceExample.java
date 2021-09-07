package com.aique.db.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;



public class BasicDataSourceExample {

    public static void main(String[] args) {
        // First we set up the BasicDataSource.
        System.out.println("Setting up data source.");
        String dbUri = "jdbc:h2:~/test";
        DataSource dataSource = setupDataSource(dbUri);
        System.out.println("Done.");

        // Now, we can use JDBC DataSource as we normally would.
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            System.out.println("Creating connection.");
            conn = dataSource.getConnection();
            System.out.println("Creating statement.");
            stmt = conn.createStatement();
            System.out.println("Executing statement.");
            String query  = "SELECT *  FROM USERS";
            rset = stmt.executeQuery(query);
            System.out.println("Results:");
            int numcols = rset.getMetaData().getColumnCount();
            while(rset.next()) {
                for(int i=1;i<=numcols;i++) {
                    System.out.print("\t" + rset.getString(i));
                }
                System.out.println("");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rset != null) rset.close(); } catch(Exception e) { }
            try { if (stmt != null) stmt.close(); } catch(Exception e) { }
            try { if (conn != null) conn.close(); } catch(Exception e) { }
        }
    }

    public static DataSource setupDataSource(String connectURI) {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl(connectURI);
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }

    public static void printDataSourceStats(DataSource ds) {
        BasicDataSource bds = (BasicDataSource) ds;
        System.out.println("NumActive: " + bds.getNumActive());
        System.out.println("NumIdle: " + bds.getNumIdle());
    }

    public static void shutdownDataSource(DataSource ds) throws SQLException {
        BasicDataSource bds = (BasicDataSource) ds;
        bds.close();
    }
}
