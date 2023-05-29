/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bse203027;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class DoctorDAO {
         private Connection connection;

    public DoctorDAO() {
        connectToDatabase();
    }

    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/library"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 public boolean createPatient(String Name, String password, String doctorId, String address,String fathername) {
        String query = "INSERT INTO doctor (Name, password, doctorId, address, fathername) VALUES (?, ?, ?, ?, ?)";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, Name);
            statement.setString(2, password);
            String patientId = null;
            statement.setString(3, patientId);
            statement.setString(4, address);
            statement.setString(5, fathername);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}



