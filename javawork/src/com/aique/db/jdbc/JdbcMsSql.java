package com.aique.db.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcMsSql {

	public static Connection connObj;
	public static String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true";

	public static void getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connObj = DriverManager.getConnection(JDBC_URL);
			if(connObj != null) {
				DatabaseMetaData metaObj = (DatabaseMetaData) connObj.getMetaData();
				System.out.println("Driver Name?= " + metaObj.getDriverName() + ", Driver Version?= " + metaObj.getDriverVersion() + ", Product Name?= " + metaObj.getDatabaseProductName() + ", Product Version?= " + metaObj.getDatabaseProductVersion());
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void main(String[] args) {

		getConnection();
	}
}