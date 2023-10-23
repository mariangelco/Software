/*
 * @author lilibeth 
 */
package software;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class MySQL implements BasesDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/floreria?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String usuario = "root";
    private static final String contra = "";
    private Connection connection;

    @Override
    public void ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, usuario, contra);
            System.out.println("Bienvenido");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void Select() {
        if (connection != null) {
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");
                System.out.println("Los usuarios son: ");
                while (resultSet.next()) {
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    System.out.println(nombre + " " + apellido);
                }
                resultSet.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Hubo un error");
        }
    }

    @Override
    public void Insert() {
        MySQL mySQL = new MySQL();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione la siguiente informacion para el nuevo registro:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        try {
            String sql = "INSERT INTO usuarios (nombre, apellido) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("El registro se ha realizado.");
            } else {
                System.out.println("El registro no se ha realizado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void Delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione la siguiente informacion para eliminar un registro:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        try {
            String sql = "DELETE FROM usuarios WHERE (nombre, apellido) = (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("El registro se ha eliminado.");
            } else {
                System.out.println("El registro no se ha eliminado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu \n"
                + "1.- Consultar registros \n"
                + "2.- Insertar registros \n"
                + "3.- Eliminar registros");

        System.out.println("¿Que accion desea realizar?");
        String op = scanner.nextLine();
        switch (op) {
            case "1" -> Select();
            case "2" -> Insert();
            case "3" -> Delete();
            default -> System.out.println("Opción incorrecta");
        }
    }
}

