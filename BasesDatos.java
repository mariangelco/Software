/*
Equipo 4:
Acevedo Sachenka
Aragon Diana
Celaya Juan
Contreras Mariangel
*/
package software;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public interface BasesDatos {
    void ConexionBD();
    void Select();
    void Insert();
    void Delete();
}

/*
Cosas que mariadb y mysql tienen en comun:
Conexion a bd
Registro de datos
Lectura de datos
Eliminación de datos
Actualización de datos
*/

