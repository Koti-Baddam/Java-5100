package edu.neu.mgen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Baddam";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASS = "Koti@2403#MYSQL";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASS)) {
            conn.setAutoCommit(false);

            System.out.println("Initial table state:");
            printTable(conn);

            String updateSql = "UPDATE test SET First_Name = 'Baddam', Last_Name = 'Kotireddy' WHERE First_Name = 'Kotireddy' AND Last_Name = 'Baddam'";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                updateStmt.executeUpdate();
            }

            System.out.println("Table state after update:");
            printTable(conn);

            // Roll back the update
            conn.rollback();

            System.out.println("Table state after rollback:");
            printTable(conn);

        } catch (SQLException e) {
            System.err.println("Database operation error: " + e.getMessage());
        }
    }

    private static void printTable(Connection conn) throws SQLException {
        String selectSql = "SELECT Student_ID, First_Name, Last_Name FROM test ORDER BY Student_ID";
        try (PreparedStatement selectStmt = conn.prepareStatement(selectSql);
                ResultSet resultSet = selectStmt.executeQuery()) {

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Student_ID") + " | " + resultSet.getString("First_Name") + " | "
                        + resultSet.getString("Last_Name"));
            }
            System.out.println();
        }
    }
}
