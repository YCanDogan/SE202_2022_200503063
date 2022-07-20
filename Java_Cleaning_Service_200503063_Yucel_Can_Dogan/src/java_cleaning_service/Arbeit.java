package java_cleaning_service;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.*;

// --> ONEMLI --> BURCU HOCA ARBEIT İÇİN JTABLE İSTEDİ 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author canba
 */
public class Arbeit extends javax.swing.JFrame {

    Database.DatabaseHandler databaseHandler = new Database.DatabaseHandler();

    public Arbeit() {
        initComponents();
        LoadCatWorker();

        ArbttxtCustID.setEnabled(false);
        ArbttxtCustName.setEnabled(false);
        ArbttxtArbKost.setEnabled(false);
        ArbtdateDatum.setEnabled(false);
        ArbtdateDueDatum.setEnabled(false);

        // correct Date format
        ArbtdateDatum.setDateFormatString("yyyy/MM/dd");
        ArbtdateDueDatum.setDateFormatString("yyyy/MM/dd");
    }

    //=================================================FUNCTION-1===========================================================================================
    // to see Mitarbeiter List from Arbeit Page:
    public void LoadCatWorker() {

        try {

            databaseHandler.loadCatWorkerArbeit(ArbtComboMitID);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Arbeit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }

    }

    //=================================================FUNCTION END==========================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        ArbtComboMitID = new javax.swing.JComboBox<>();
        ArbttxtCustName = new javax.swing.JTextField();
        ArbttxtCustID = new javax.swing.JTextField();
        ArbttxtArbKost = new javax.swing.JTextField();
        ArbtdateDatum = new com.toedter.calendar.JDateChooser();
        ArbtdateDueDatum = new com.toedter.calendar.JDateChooser();
        ArbtbuttonOk = new java.awt.Button();
        ArbtbuttonCancel = new java.awt.Button();
        txtAva = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        label1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ARBEIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Mitarbeiter ID:");

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Customer ID:");

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Customer Name:");

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Arbeit Kosten: ");

        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Datum:");

        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Due Datum:");

        ArbtComboMitID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArbtComboMitIDActionPerformed(evt);
            }
        });

        ArbttxtCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArbttxtCustIDActionPerformed(evt);
            }
        });
        ArbttxtCustID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ArbttxtCustIDKeyPressed(evt);
            }
        });

        ArbttxtArbKost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArbttxtArbKostActionPerformed(evt);
            }
        });

        ArbtbuttonOk.setLabel("Ok");
        ArbtbuttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArbtbuttonOkActionPerformed(evt);
            }
        });

        ArbtbuttonCancel.setLabel("Cancel");
        ArbtbuttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArbtbuttonCancelActionPerformed(evt);
            }
        });

        txtAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArbttxtArbKost)
                            .addComponent(ArbtdateDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArbtdateDueDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArbttxtCustID)
                            .addComponent(ArbttxtCustName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ArbtComboMitID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(txtAva, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ArbtbuttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ArbtbuttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ArbtComboMitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArbttxtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArbttxtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArbttxtArbKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ArbtdateDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArbtdateDueDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ArbtbuttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArbtbuttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArbtbuttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbtbuttonOkActionPerformed
        // TODO add your handling code here:
        // Add button from Arbeit

        String mitID = ArbtComboMitID.getSelectedItem().toString();
        String cust_id = ArbttxtCustID.getText();

        String arbtKost = ArbttxtArbKost.getText();

        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String date = Date_Format.format(ArbtdateDatum.getDate());

        SimpleDateFormat Date_Format_due = new SimpleDateFormat("yyyy-MM-dd");
        String duedate = Date_Format_due.format(ArbtdateDueDatum.getDate());

        // Add Button from Arbeit Page:
        try {

            databaseHandler.arbtbuttonOkArbeit(mitID, cust_id, arbtKost, date, duedate);
            JOptionPane.showMessageDialog(this, "Erfolgreich...");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Arbeit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_ArbtbuttonOkActionPerformed

    private void ArbtbuttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbtbuttonCancelActionPerformed
        // TODO add your handling code here:
        // I added this method.
        this.hide();
        dispose();
    }//GEN-LAST:event_ArbtbuttonCancelActionPerformed

    private void txtAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvaActionPerformed

    private void ArbtComboMitIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbtComboMitIDActionPerformed
        // TODO add your handling code here:
        // Mitarbeiter available or not

        String mit_id = ArbtComboMitID.getSelectedItem().toString();

        try {

            databaseHandler.arbtComboMitIDArbeit(mit_id, txtAva, ArbtdateDatum, ArbtdateDueDatum, ArbttxtArbKost, ArbttxtCustID, ArbttxtCustName);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Arbeit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_ArbtComboMitIDActionPerformed

    private void ArbttxtArbKostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbttxtArbKostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArbttxtArbKostActionPerformed

    private void ArbttxtCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArbttxtCustIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArbttxtCustIDActionPerformed

    private void ArbttxtCustIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ArbttxtCustIDKeyPressed
        // TODO add your handling code here:
        // Customer ID key pressed: IF it gonna works properly we are going to 
        // create new database for mitarbeiter

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String cust_id = ArbttxtCustID.getText();

            try {

                databaseHandler.arbttextCustIDKeyPressedArbeit(cust_id, ArbttxtCustName);

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Arbeit.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }

        }


    }//GEN-LAST:event_ArbttxtCustIDKeyPressed

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
            java.util.logging.Logger.getLogger(Arbeit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbeit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbeit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbeit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbeit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ArbtComboMitID;
    private java.awt.Button ArbtbuttonCancel;
    private java.awt.Button ArbtbuttonOk;
    private com.toedter.calendar.JDateChooser ArbtdateDatum;
    private com.toedter.calendar.JDateChooser ArbtdateDueDatum;
    private javax.swing.JTextField ArbttxtArbKost;
    private javax.swing.JTextField ArbttxtCustID;
    private javax.swing.JTextField ArbttxtCustName;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTextField txtAva;
    // End of variables declaration//GEN-END:variables
}
