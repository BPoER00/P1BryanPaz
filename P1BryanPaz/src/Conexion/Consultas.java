package Conexion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexion.ConexionDB;
import javax.swing.JOptionPane;
import p1bryanpaz.DatosAlumno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    
    
    public List<DatosAlumno> Mostrar(){
        
        boolean DatoEncontrado = false;
        List<DatosAlumno> ListaDatos = new ArrayList<>();
        
        try{
            
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("SELECT * FROM Estudiantes");
            ResultSet Resultado = Consultar.executeQuery();
            
            while(Resultado.next()){
                DatosAlumno Estudiante = new DatosAlumno();
                DatoEncontrado = true;
                
                Estudiante.setId(Resultado.getInt("Id"));
                Estudiante.setNombre(Resultado.getString("Nombre"));
                Estudiante.setCarne(Resultado.getString("Carne"));
                Estudiante.setCurso(Resultado.getString("Curso"));
                
                
                ListaDatos.add(Estudiante);
            }
            
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        if(!DatoEncontrado){
            System.out.println("Estudiante No Encontrado");
        }
        
        return ListaDatos.isEmpty() ? new ArrayList<>() : ListaDatos;
    }
    
    
    
    public void Eliminar(int Id){
        try{
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("DELETE FROM Estudiantes WHERE Id = ?");
            
            Consultar.setInt(1, Id);
            
            ResultSet Resultado = Consultar.executeQuery();
            
            if(!Resultado.equals(null)){
                System.out.println("Datos Eliminados Correctamente.");
            }else{
                System.out.println("Error Al Eliminar Los Datos");
            }
            
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    
    
    public void Editar(int Id, DatosAlumno Estudiante){
        try{
            
            ConexionDB conectar = new ConexionDB();
            Connection conn = conectar.AbrirConexion();

            Consultar = conn.prepareStatement("UPDATE Estudiantes SET " + "Carne = ?, " + "Nombre = ?, " + "Curso = ? " + " WHERE Id = ?");
            Consultar.setString(1, Estudiante.getNombre());
            Consultar.setString(2, Estudiante.getCarne());
            Consultar.setString(3, Estudiante.getCurso());

            Consultar.executeUpdate();
 
            conn.close();
        
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    
    
        public List<DatosAlumno> Buscar(int Id){
        
        boolean DatoEncontrado = false;
        List<DatosAlumno> ListaDatos = new ArrayList<>();
        
        try{
            
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("SELECT * FROM Estudiantes WHERE Id = ?");
            
            Consultar.setInt(1, Id);
            
            ResultSet Resultado = Consultar.executeQuery();
            
            while(Resultado.next()){
                DatosAlumno Estudiante = new DatosAlumno();
                DatoEncontrado = true;
                
                Estudiante.setId(Resultado.getInt("Id"));
                Estudiante.setNombre(Resultado.getString("Nombre"));
                Estudiante.setCarne(Resultado.getString("Carne"));
                Estudiante.setCurso(Resultado.getString("Curso"));
                
                ListaDatos.add(Estudiante);
            }
            
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        if(!DatoEncontrado){
            System.out.println("Estudiante No Encontrado");
        }
        
        return ListaDatos.isEmpty() ? new ArrayList<>() : ListaDatos;
    }
}
