/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import p1bryanpaz.Nodo;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class Arbol extends javax.swing.JPanel {
    int dato = 0;
    public Arbol() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtDato7 = new javax.swing.JTextField();
        TxtDato1 = new javax.swing.JTextField();
        TxtDato2 = new javax.swing.JTextField();
        TxtDato3 = new javax.swing.JTextField();
        TxtDato6 = new javax.swing.JTextField();
        TxtDato5 = new javax.swing.JTextField();
        TxtDato4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LbTotal = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtDato7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, 70));

        TxtDato1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 70));

        TxtDato2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, 70));

        TxtDato3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 70, 70));

        TxtDato6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 70, 70));

        TxtDato5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 70));

        TxtDato4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtDato4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(TxtDato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 70));

        jButton1.setText("Sumar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel1.setText("Total");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        LbTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        add(LbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int dato1 = Integer.parseInt(TxtDato1.getText());
        int dato2 = Integer.parseInt(TxtDato2.getText());
        int dato3 = Integer.parseInt(TxtDato3.getText());
        int dato4 = Integer.parseInt(TxtDato4.getText());
        int dato5 = Integer.parseInt(TxtDato5.getText());
        int dato6 = Integer.parseInt(TxtDato6.getText());
        int dato7 = Integer.parseInt(TxtDato7.getText());
        
        Nodo raiz = new Nodo(dato1);
        Nodo nodo2 =new Nodo(dato2);
        Nodo nodo3 =new Nodo(dato3);
        nodo2.setIzquierda(new Nodo(dato4));
        nodo2.setDerecha(new Nodo(dato5));
        nodo3.setIzquierda(new Nodo(dato6));
        nodo3.setDerecha(new Nodo(dato7));
        
        raiz.setIzquierda(nodo2);
        raiz.setDerecha(nodo3);
        
        int resultado = inOrden(raiz);
        
        LbTotal.setText(String.valueOf(resultado));
        
    }//GEN-LAST:event_jButton1MouseClicked

    private int inOrden(Nodo raiz) {
        
        
        if (raiz != null) {
          inOrden(raiz.getIzquierda());
          inOrden(raiz.getDerecha());
          System.out.print(raiz.getDato() + " - ");
          dato = dato + raiz.getDato();
        }
        
        return dato;
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTotal;
    private javax.swing.JTextField TxtDato1;
    private javax.swing.JTextField TxtDato2;
    private javax.swing.JTextField TxtDato3;
    private javax.swing.JTextField TxtDato4;
    private javax.swing.JTextField TxtDato5;
    private javax.swing.JTextField TxtDato6;
    private javax.swing.JTextField TxtDato7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
