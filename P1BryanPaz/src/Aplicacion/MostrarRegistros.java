/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Conexion.ConexionDB;
import Conexion.Consultas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import p1bryanpaz.DatosAlumno;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class MostrarRegistros extends javax.swing.JPanel {
    
    
    Consultas Consul = new Consultas();
    PreparedStatement Consultar;
    
    public MostrarRegistros() {
        initComponents();
        Mostrar();
    }

    public void Mostrar(){
        
        
        try{
            DefaultTableModel Modelo = new DefaultTableModel();
            Modelo.addColumn("Id");
            Modelo.addColumn("Carne");
            Modelo.addColumn("Nombre");
            Modelo.addColumn("Curso");
            Tabla.setModel(Modelo);
            
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("SELECT * FROM Estudiantes");
            
            ResultSet Resultado = Consultar.executeQuery();
            
            ResultSetMetaData rsmd = Resultado.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            
            while(Resultado.next()){
               
                
                Object[] filas = new Object[cantidadColumnas];
            
                for(int i = 0; i < cantidadColumnas; i++){
                filas[i] = Resultado.getObject(i + 1);
            }
            
            Modelo.addRow(filas);
                
            }
                
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtOpciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 490, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));
        add(TxtOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Registros");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int Id = Integer.parseInt(TxtOpciones.getText());
        if(!TxtOpciones.getText().equals("")){
            Consul.Eliminar(Id);    
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el Id de quien desea Eliminar", "Advertencia", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Editar Abrir = new Editar();
        Abrir.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        buscar();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         Mostrar();
    }//GEN-LAST:event_jLabel2MouseClicked
    
     public void buscar(){
        int Id = Integer.parseInt(TxtOpciones.getText());
        boolean DatoEncontrado = false;
        try{
            DefaultTableModel Modelo = new DefaultTableModel();
            Modelo.addColumn("Id");
            Modelo.addColumn("Carne");
            Modelo.addColumn("Nombre");
            Modelo.addColumn("Curso");
            Tabla.setModel(Modelo);
            
            ConexionDB Conectar = new ConexionDB();
            Connection Conn = Conectar.AbrirConexion();
            
            Consultar = Conn.prepareStatement("SELECT * FROM Estudiantes WHERE Id = ?");
            
            Consultar.setInt(1, Id);
            
            ResultSet Resultado = Consultar.executeQuery();
            
            ResultSetMetaData rsmd = Resultado.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            
            while(Resultado.next()){
                DatoEncontrado = true;

                Object[] filas = new Object[cantidadColumnas];
            
                for(int i = 0; i < cantidadColumnas; i++){
                filas[i] = Resultado.getObject(i + 1);
                }
               Modelo.addRow(filas); 
            }
                
            Conn.close();
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        if(!DatoEncontrado){
            System.out.println("Estudiante No Encontrado");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
