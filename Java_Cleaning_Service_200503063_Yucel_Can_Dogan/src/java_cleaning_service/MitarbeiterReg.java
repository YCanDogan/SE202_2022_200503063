/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_cleaning_service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import java.text.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author canba
 */
public class MitarbeiterReg extends javax.swing.JFrame {

    Database.DatabaseHandler databaseHandler = new Database.DatabaseHandler();

    /**
     * Creates new form mitarbeiterReg
     */
    public MitarbeiterReg() {
        initComponents();
        MitId();
        table_update();
    }

    //==============================================FUNCTION-1==========================================================
    // Düzelt Önemli --> IMPORTAN
    public void upDateDB() {

        String rgno = txtMitId.getText();
        String name = txtName.getText();
        String sName = txtSname.getText();
        String mail = txtMail.getText();
        String ava = Comavl.getSelectedItem().toString();

        databaseHandler.updateDatabaseMitarbeiter(ava, name, sName, mail, ava, jTableMit);

    }

    //==============================================END FUNCTION==========================================================
    //==============================================FUNCTION-2============================================================
    public void table_update() {

        try {
            databaseHandler.tableUpdateMitarbeiter(jTableMit);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MitarbeiterReg.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }

    }

    //==============================================END FUNCTION==========================================================
    public void MitId() {
        try {

            databaseHandler.mitIdMitarbeiter(txtMitId);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MitarbeiterReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMitId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSname = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMit = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonMainAdd = new javax.swing.JButton();
        jButtonMainEdit = new javax.swing.JButton();
        jButtonMainDelete = new javax.swing.JButton();
        jButtonMainCancel = new javax.swing.JButton();
        Comavl = new javax.swing.JComboBox<>();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        label1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("MITARBEITER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MitarbeiterId:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mail:");

        txtMitId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMitIdActionPerformed(evt);
            }
        });

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        jTableMit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MitId", "Name", "Sname", "Mail", "Av."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableMit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMitMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMit);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Avaiable:");

        jButtonMainAdd.setText("Add");
        jButtonMainAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMainAddActionPerformed(evt);
            }
        });

        jButtonMainEdit.setText("Edit");
        jButtonMainEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMainEditActionPerformed(evt);
            }
        });

        jButtonMainDelete.setText("Delete");
        jButtonMainDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMainDeleteActionPerformed(evt);
            }
        });

        jButtonMainCancel.setText("Cancel");
        jButtonMainCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMainCancelActionPerformed(evt);
            }
        });

        Comavl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        Comavl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComavlActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.setToolTipText("");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSname, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtMitId)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonMainAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMainEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonMainDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMainCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Comavl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMitId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comavl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonMainAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMainEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonMainDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMainCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void txtMitIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMitIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMitIdActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void jButtonMainAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMainAddActionPerformed
        // TODO add your handling code here:
        // add button:

        String rgno = txtMitId.getText();
        String name = txtName.getText();
        String sName = txtSname.getText();
        String mail = txtMail.getText();
        String ava = Comavl.getSelectedItem().toString();

        try {
            databaseHandler.addMitarbieter(rgno, name, sName, mail, ava);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MitarbeiterReg.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Bitte geben Sie ein neues ID." + "\n" + ex);
        }

        upDateDB();

        txtName.setText("");
        txtSname.setText("");
        txtMail.setText("");
        Comavl.setSelectedIndex(-1);

        txtName.requestFocus();
        MitId();
        table_update();

    }//GEN-LAST:event_jButtonMainAddActionPerformed

    private void ComavlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComavlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComavlActionPerformed

    private JFrame frame;


    private void jButtonMainCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMainCancelActionPerformed

        this.hide();
        dispose();

    }//GEN-LAST:event_jButtonMainCancelActionPerformed


    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        // Reset Button
        txtMitId.setText("");
        txtName.setText("");
        txtSname.setText("");
        txtMail.setText("");
        Comavl.setSelectedIndex(-1);
    }//GEN-LAST:event_jButtonResetActionPerformed


    private void jButtonMainEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMainEditActionPerformed
        // TODO add your handling code here:
        // Edit Button

        DefaultTableModel model = (DefaultTableModel) jTableMit.getModel();
        int selectedIndex = this.jTableMit.getSelectedRow();

        // other code line: 
        try {

            String name = this.txtName.getText();
            String sname = this.txtSname.getText();
            String mail = this.txtMail.getText();
            String ava = this.Comavl.getSelectedItem().toString();
            String id = model.getValueAt(selectedIndex, 0).toString();

            databaseHandler.mitUpdateEditMitarbeiter(name, sname, mail, ava, id);
            JOptionPane.showMessageDialog(this, "Mitarbeiter Updated...");

            this.jButtonMainDelete.setEnabled(false);
            this.jButtonMainAdd.setEnabled(true);

            this.table_update();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MitarbeiterReg.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButtonMainEditActionPerformed


    private void jTableMitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMitMouseClicked
        // TODO add your handling code here:
        // Mause Clicked TableMitarbeiter: 
        DefaultTableModel RecordTable = (DefaultTableModel) jTableMit.getModel();
        int SelectedRows = jTableMit.getSelectedRow();

        txtMitId.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtName.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtSname.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtMail.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        Comavl.setSelectedItem(RecordTable.getValueAt(SelectedRows, 4).toString());


    }//GEN-LAST:event_jTableMitMouseClicked


    private void jButtonMainDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMainDeleteActionPerformed
        // TODO add your handling code here:
        // Delete Button when action performed: 

        DefaultTableModel d1 = (DefaultTableModel) jTableMit.getModel();
        int selectIndex = jTableMit.getSelectedRow();

        String id = d1.getValueAt(selectIndex, 0).toString();

        int dialogResult = JOptionPane.showConfirmDialog(this, "Möchten Sie die ausgehwælte Mitarbieter löschen?", " WARNING", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {

            try {

                databaseHandler.deleteMitarbeiter(id);

                JOptionPane.showMessageDialog(this, "Mitarbeiter ausgelöscht");

                table_update();

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MitarbeiterReg.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }

        }

    }//GEN-LAST:event_jButtonMainDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MitarbeiterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MitarbeiterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MitarbeiterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MitarbeiterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MitarbeiterReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comavl;
    private javax.swing.JButton jButtonMainAdd;
    private javax.swing.JButton jButtonMainCancel;
    private javax.swing.JButton jButtonMainDelete;
    private javax.swing.JButton jButtonMainEdit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMit;
    private java.awt.Label label1;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMitId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSname;
    // End of variables declaration//GEN-END:variables
}
