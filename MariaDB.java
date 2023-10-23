/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software;

/**
 *
 * @author lilib
 */
public class MariaDB implements BasesDatos{
    public void ConexionBD(){
        System.out.println("Se ha conectado a la base de datos MariaDB");
    }
    public void Select(){
        System.out.println("El registro se ha realizado");
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
