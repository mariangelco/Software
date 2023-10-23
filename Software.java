/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software;

/**
 *
 * @author lilib
 */
public class Software {

    public static void main(String[] args) {
        //Solo llamaremos a MySQL
        MySQL mySQL = new MySQL();
        mySQL.ConexionBD();
        mySQL.menu();   
    }


    
}
