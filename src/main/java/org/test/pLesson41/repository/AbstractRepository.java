package org.test.pLesson41.repository;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractRepository {
    @SneakyThrows
    public static Connection createCon() {
        final String url = "jdbc:postgresql://localhost:5432/Test";
        final String username = "postgres";
        final String password = "root";
        Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}