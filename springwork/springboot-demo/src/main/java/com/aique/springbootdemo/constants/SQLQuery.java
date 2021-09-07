package com.aique.springbootdemo.constants;

public interface SQLQuery {

    String CREATE_TABLE =  "CREATE TABLE   USERS " +
            "(ID INTEGER NOT NULL , " +
            " NAME VARCHAR(255), " +
            " EMAIL VARCHAR(255), " +
            " COUNTRY VARCHAR(255), " +
            " PASSWORD VARCHAR(255), " +
            " PRIMARY KEY ( ID ))";

    String INSERT_USER = "INSERT INTO users" +
            "  (id, name, email, country, password) VALUES " +
            " (?, ?, ?, ?,?);";
}
