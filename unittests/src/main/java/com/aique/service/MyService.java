package com.aique.service;

public class MyService {

    private Database database;

    public MyService(Database database) {

        this.database = database;
    }

    public boolean query(String query) {
      // a dummy method to check database is up
        return database.isAvailable();
    }


    @Override
    public String toString() {

        return "Database id: " + String.valueOf(database.getUniqueId());
    }
}
