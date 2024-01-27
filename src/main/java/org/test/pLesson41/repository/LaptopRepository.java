package org.test.pLesson41.repository;

import org.test.pLesson41.entity.Laptop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LaptopRepository extends AbstractRepository {


    public static boolean createLaptop() throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = createCon();
            statement = conn.createStatement();

            final String sql = "CREATE TABLE public.laptop\n" +
                    "(\n" +
                    "    id serial NOT NULL,\n" +
                    "    name text,\n" +
                    "    is_available boolean,\n" +
                    "    description text,\n" +
                    "    PRIMARY KEY (id)\n" +
                    ");\n" +
                    "\n" +
                    "ALTER TABLE IF EXISTS public.laptop\n" +
                    "    OWNER to postgres;";

            final boolean execute = statement.execute(sql);

            return execute;

        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        } finally {
            try {
                if (Objects.nonNull(conn)) {
                    conn.close();
                }
                if (Objects.nonNull(statement)) {
                    statement.close();
                }
            } catch (SQLException ex) {
                System.out.println("Connection failed..." + ex);
            }
        }
        throw new IllegalArgumentException();
    }

    public static int insertValue(int id, String name, boolean available, String description) {
        try {
            final String sql = "INSERT INTO public.laptop(\n" +
                    "\tid, name, is_available, description)\n" +
                    "\tVALUES " + "(" + id + ", " + name + ", " + available + ", " + description + ")";
            try (Connection conn = createCon();
                 Statement statement = conn.createStatement()) {
                final int i = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

                if (i > 0) {
                    final ResultSet generatedKeys = statement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        final int anInt = generatedKeys.getInt(1);
                        System.out.println(anInt);
                    }
                }
                return i;
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
        throw new IllegalArgumentException();
    }

    public static List<Laptop> gatAllLaptops() {
        try {
            final String sql = "SELECT * FROM laptop";
            try (Connection conn = createCon();
                 Statement statement = conn.createStatement()) {
                final ResultSet resultSet = statement.executeQuery(sql);

                final List<Laptop> laptops = new ArrayList<>();

                while (resultSet.next()) {
                    Laptop laptop = new Laptop();
                    laptop.setId(resultSet.getInt("id"));
                    laptop.setName(resultSet.getString("name"));
                    laptop.setIsAvailable(resultSet.getBoolean("is_available"));
                    laptop.setDescription(resultSet.getString("description"));
                    laptops.add(laptop);
                }

                return laptops;
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
        throw new IllegalArgumentException();
    }

    public static void insertIntoPrepare(final Laptop laptop) {
        try {

            String sql = "INSERT INTO public.laptop(id, name, is_available, description) VALUES (?, ?, ?, ?)";

            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, laptop.getId());
                preparedStatement.setString(2, laptop.getName());
                preparedStatement.setBoolean(3, laptop.getIsAvailable());
                preparedStatement.setString(4, laptop.getDescription());

                int rows = preparedStatement.executeUpdate();
                System.out.println("add Lines Device: " + rows);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void getLaptops(final String id) {

        try {
            String sql = "SELECT * FROM laptop where id = " + id;
            try (Connection conn = createCon();
                 Statement statement = conn.createStatement()) {
                final ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    System.out.println(resultSet.getString("name"));
                }

            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
        throw new IllegalArgumentException();
    }

    public static void batchProcessing() {
        try {
            String insertQuery = "INSERT INTO laptop (id, name, is_available, description) VALUES (?, ?, ?, ?)";

            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)) {
                conn.setAutoCommit(false);

                preparedStatement.setInt(1, 11);
                preparedStatement.setString(2, "Laptop 1");
                preparedStatement.setBoolean(3, true);
                preparedStatement.setString(4, "Description 1");
                preparedStatement.addBatch();

                preparedStatement.setInt(1, 12);
                preparedStatement.setString(2, "Laptop 2");
                preparedStatement.setBoolean(3, false);
                preparedStatement.setString(4, "Description 2");

                preparedStatement.addBatch();

                preparedStatement.setInt(1, 32);
                preparedStatement.setString(2, "Laptop 3");
                preparedStatement.setBoolean(3, true);
                preparedStatement.setString(4, "Description 3");

                preparedStatement.addBatch();

                int[] result = preparedStatement.executeBatch();

                conn.commit();

                System.out.println("add Lines Device: " + result);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void transactionExample() {
        Connection connection = null;
        Savepoint savepoint;

        try {
            connection = createCon();

            connection.setAutoCommit(false);

            insertLaptop(connection, 77, "Name", true, "Name2");

            savepoint = connection.setSavepoint("SV1");

            insertLaptop(connection, 78, "Laptop 2", false, "Description 2");

            connection.rollback(savepoint);

            insertLaptop(connection, 79, "Laptop 3", true, "Description 3");

            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void insertLaptop(Connection connection, int id, String name, boolean isAvailable, String description)
            throws SQLException {
        String insertQuery = "INSERT INTO laptop (id, name, is_available, description) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertQuery);

        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setBoolean(3, isAvailable);
        statement.setString(4, description);

        statement.executeUpdate();
        statement.close();
    }

    public static void getCallableStatementWithParams(final int id) {
        try {
            try (Connection conn = createCon();
                 CallableStatement callableStatement = conn.prepareCall("{call get_difference(?)}")) {
                callableStatement.setInt(1, id);
                final ResultSet resultSet = callableStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

}
