/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    boolean cambiarInsertar = false;
    boolean cambiarArbol = false;
    PanelInsertarDatos PanelInsert = new PanelInsertarDatos();
    PanelArbolDatos PanelArboles = new PanelArbolDatos();
    public MenuPrincipal() {
        
        initComponents();
        BtnComprimir.setVisible(false);
        PanelArboles.setVisible(false);
        PanelInsert.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInsertar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelMostrar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BtnComprimir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnInsertar = new javax.swing.JLabel();
        BtnArboles = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelInsertar.setBackground(new java.awt.Color(0, 0, 0));
        PanelInsertar.setForeground(new java.awt.Color(0, 0, 0));
        PanelInsertar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        PanelInsertar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        PanelMostrar.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostrar.setLayout(new java.awt.BorderLayout());
        PanelInsertar.add(PanelMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 290, 440));

        getContentPane().add(PanelInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 0, 390, 570));

        jPanel1.setBackground(new java.awt.Color(46, 65, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnComprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ComprimirMenu Principal.png"))); // NOI18N
        BtnComprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnComprimirMouseClicked(evt);
            }
        });
        jPanel1.add(BtnComprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Principal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescomprimirMenu.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir Opciones.png"))); // NOI18N
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescomprimirMenu.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        BtnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InsertarOpciones.png"))); // NOI18N
        BtnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInsertarMouseClicked(evt);
            }
        });
        jPanel1.add(BtnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        BtnArboles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArbolesBinarios.png"))); // NOI18N
        BtnArboles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnArbolesMouseClicked(evt);
            }
        });
        jPanel1.add(BtnArboles, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescomprimirMenu.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 430, 460));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Principal.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(!BtnComprimir.isVisible()){
            Animacion.Animacion.mover_izquierda(170, 60, 1, 2, BtnInsertar);
            Animacion.Animacion.mover_derecha(170, 280, 1, 2, BtnArboles);
            Animacion.Animacion.bajar(170, 280, 1, 2, BtnSalir);
            BtnComprimir.setVisible(true);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void BtnComprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnComprimirMouseClicked
        if(BtnComprimir.isVisible()){
            Animacion.Animacion.mover_derecha(60, 170, 1, 2, BtnInsertar);
            Animacion.Animacion.mover_izquierda(280, 170, 1, 2, BtnArboles);
            Animacion.Animacion.subir(280, 170, 1, 2, BtnSalir);
            BtnComprimir.setVisible(true);
            BtnComprimir.setVisible(false);
        }
    }//GEN-LAST:event_BtnComprimirMouseClicked

    private void BtnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInsertarMouseClicked
            
            PanelMostrar.add(PanelInsert);
            PanelArboles.setVisible(false);
            PanelInsert.setVisible(true);
            Animacion.Animacion.mover_derecha(-390, 0, 1, 2, PanelInsertar);
        
    }//GEN-LAST:event_BtnInsertarMouseClicked

    private void BtnArbolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnArbolesMouseClicked
            PanelMostrar.add(PanelArboles);
            PanelArboles.setVisible(true);
            PanelInsert.setVisible(false);
            Animacion.Animacion.mover_derecha(-390, 0, 1, 2, PanelInsertar);
            
    }//GEN-LAST:event_BtnArbolesMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            Animacion.Animacion.mover_izquierda(0, -390, 1, 2, PanelInsertar);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnArboles;
    private javax.swing.JLabel BtnComprimir;
    private javax.swing.JLabel BtnInsertar;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel PanelInsertar;
    private javax.swing.JPanel PanelMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
