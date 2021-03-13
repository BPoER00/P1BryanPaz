/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import p1bryanpaz.DatosAlumno;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class ArchivoPlano {
    File Contenedor = new File("Parcial1.txt");
    
    public void crear(){
        try{
            if(Contenedor.exists()){
                System.out.println("Documento ya existente");
            }else{
                Contenedor.createNewFile();
                System.out.println("Documento creado");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error: "+e);
        }
    }
    
   public void insertar(DatosAlumno Alumno){
       crear();

       try{
            BufferedWriter Escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Contenedor, true)));
            Escribir.write(Alumno.getId()+"\n");
            Escribir.write(Alumno.getCarne()+"\n");
            Escribir.write(Alumno.getNombre()+"\n");
            Escribir.write(Alumno.getCurso()+"\n");
            
            System.out.println("Datos Guardados");
            Escribir.close();
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error: "+e);
       }
   }
    
}
