package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import net.javaguides.registration.model.employee;

public class employeeDao {

    public int registerEmployee(employee employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
            "  (first_name, last_name, username, address, contact, password) VALUES " +
            " (?, ?, ?, ?,?,?);";

        int result = 0;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            String username = "root";
            String password = "..."; // Instead of three points enter your password
            
            // Set up connection properties
            Properties properties = new Properties();
            properties.setProperty("user", username);
            properties.setProperty("password", password);
            properties.setProperty("useSSL", "false");
            String url = "jdbc:mysql://localhost:3306/employees?useSSL=false&allowPublicKeyRetrieval=true";
            
            // Establish the connection
            try (Connection connection = DriverManager.getConnection(url, properties);
                 // Create a prepared statement
                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {

                // Set values for prepared statement
              
                preparedStatement.setString(1, employee.getFirstName());
                preparedStatement.setString(2, employee.getLastName());
                preparedStatement.setString(3, employee.getUsername());
             
                preparedStatement.setString(4, employee.getAddress());
                preparedStatement.setString(5, employee.getContact());
                preparedStatement.setString(6, employee.getPassword());

                System.out.println(preparedStatement);

                // Execute the query or update query
                result = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                // Process SQL exception
                printSQLException(e);
            }
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException
            e.printStackTrace();
        }

        return result;
    }

    private static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
