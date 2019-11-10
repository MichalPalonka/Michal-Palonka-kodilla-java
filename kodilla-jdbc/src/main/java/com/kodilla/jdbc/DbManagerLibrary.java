package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManagerLibrary {
    private Connection conn;
    private static DbManagerLibrary dbManagerInstance;

    private DbManagerLibrary() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user");
        connectionProps.put("password", "kodilla_password");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_library?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
    }

    public static DbManagerLibrary getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManagerLibrary();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}