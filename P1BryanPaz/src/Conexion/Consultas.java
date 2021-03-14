package Conexion;


import Aplicacion.Editar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexion.ConexionDB;
import javax.swing.JOptionPane;
import p1bryanpaz.DatosAlumno;


/**
 *
 * @author Bryan Paz Ramirez
 */
public class Consultas {
    private PreparedStatement Consultar;
    public void Guardar(DatosAlumno Estudiante){
        try{
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("INSERT INTO Estudiantes (Carne, Nombre, Curso) VALUES (?, ?, ?)");
            
            Consultar.setString(1, Estudiante.getNombre());
            Consultar.setString(2, Estudiante.getCarne());
            Consultar.setString(3, Estudiante.getCurso());
            
            Consultar.executeUpdate();
            
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    public void Eliminar(int Id){
        try{
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("DELETE FROM Estudiantes WHERE Id = ?");
            
            Consultar.setInt(1, Id);
            
            Consultar.executeUpdate();
            
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    public void Editar(int Id, DatosAlumno Estudiante){
        try{
            
            ConexionDB conectar = new ConexionDB();
            Connection conn = conectar.AbrirConexion();

            Consultar = conn.prepareStatement("UPDATE Estudiantes SET " + "Carne = ?, " + "Nombre = ? " + " WHERE Id = ?");
            
            Consultar.setString(1, Estudiante.getNombre());
            Consultar.setString(2, Estudiante.getCarne());
            Consultar.setInt(3, Id);

            Consultar.executeUpdate();
 
            conn.close();
        
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
