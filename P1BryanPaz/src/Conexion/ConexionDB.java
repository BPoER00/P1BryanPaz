/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class ConexionDB {
    
    public Connection AbrirConexion(){
        Connection Conn = null;
        try{
            
            String URL = "jdbc:sqlite:ParcialDB.db";
            Conn = DriverManager.getConnection(URL);
            
            if(!Conn.equals(null)){
                System.out.println("Conexion Realizada Con Exito");
            }else{
                System.out.println("Error al Realizar la Conexion");
            }
            
        }catch(Exception e){
        
            System.out.println("Error: "+e);
        }
        
        return Conn;
    }
}
