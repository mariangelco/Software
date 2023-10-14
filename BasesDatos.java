package software;
/*
Equipo 4:
Acevedo Sachenka
Aragon Diana
Celaya Juan
Contreras Mariangel
*/
public interface BasesDatos {
    void ConexionBD();
    void Insert();
    void Delete();
    void Update();
    void Alter();
}

public class MariaDB implements BasesDatos{
    public void ConexionBD(){
        System.out.println("Se ha conectado a la base de datos MariaDB");
    }
    public void Insert(){
        System.out.println("El registro se ha realizado");
    }
    public void Delete(){
        System.out.println("El registro se ha eliminado");
    }
    public void Update(){
        System.out.println("El registro se ha modificado");
    }
    public void Alter(){
        System.out.println("La tabla se ha modificado");
    }
     //Al este metodo ser distino de MySQL no se agrega a BasesDatos
    public void DatosTemporales(){
        System.out.println("Se ha creado una tabla con los datos temporales");
    }
    public void DML(){
        System.out.println("Se ha revertido una instancia a su estado anterior");
    }
     public void MetodoDistintoMariaDB(){
        System.out.println("Este es un método distinto");
    }
}

public class MySQL implements BasesDatos{
    public void ConexionBD(){
        System.out.println("Se ha conectado a la base de datos MariaDB");
    }
    public void Insert(){
        System.out.println("El registro se ha realizado");
    }
    public void Delete(){
        System.out.println("El registro se ha eliminado");
    }
    public void Update(){
        System.out.println("El registro se ha modificado");
    }
    public void Alter(){
        System.out.println("La tabla se ha modificado");
    }
    //Al este metodo ser distino de MariaDB no se agrega a BasesDatos
    
    public void MetodoDistintoMysql(){
        System.out.println("Este es un método distinto");
    }
}
/*
Cosas que mariadb y mysql tienen en comun:
Conexion a bd
Registro de datos
Lectura de datos
Eliminación de datos
Actualización de datos
*/

