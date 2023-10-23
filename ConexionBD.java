/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/floreria?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String usuario = "root";
    private static final String contra = "";
    private Connection connection;

    public ConexionBD() {
    try {
        connection = DriverManager.getConnection(URL, usuario, contra);
        if (connection != null) {
            System.out.println("La conexión fue exitosa");
        } else {
            System.out.println("La conexión ha fallado");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public Connection getConnection() {
        return connection;
    }
    
        public void realizarConsulta() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");
            
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
            }
            
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.realizarConsulta();
    }
}


