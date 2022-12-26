/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.View;

import com.mycompany.crudmahasiswasederhana.Interfc.MahasiswaInterface;
import com.mycompany.crudmahasiswasederhana.controller.MahasiswaController;
import com.mycompany.crudmahasiswasederhana.db.Models.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059) 
 */
public class MahasiswaFrame extends javax.swing.JFrame {
    List<Mahasiswa> record = new ArrayList<Mahasiswa>();
    MahasiswaInterface mhsServis;
    int row; 

    /**
     * Creates new form MahasiswaFrame
     */
    public MahasiswaFrame() {
        initComponents();
        mhsServis = new MahasiswaController();
        
        MahasiswaTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                row = MahasiswaTable.getSelectedRow();
                if(row!=-1){
                    isiText();
                }
            }
        });
        this.statusAwal();
    }
    
    void loadData(){
        try {
            record = mhsServis.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    void isiTabel(){
        Object data[][]=new Object[record.size()][3];
        int x=0;
        for(Mahasiswa mhs:record){
            data[x][0]=mhs.getNim();
            data[x][1]=mhs.getNama();
            data[x][2]=mhs.getAlamat();
            x++;
        }
        String judul[]={"nim","nama","alamat"};
        MahasiswaTable.setModel(new DefaultTableModel(data,judul));
        jScrollPane1.setViewportView(MahasiswaTable);
    } 
    
    void isiText(){
        Mahasiswa mhs=record.get(row);
        NimText.setText(mhs.getNim());
        NamaText.setText(mhs.getNama());
        AlamatText.setText(mhs.getAlamat());
    }
    
    void kosongkanText(){
        NimText.setText("");
        NamaText.setText("");
        AlamatText.setText("");
    }
    
    void statusAwal(){
        kosongkanText();
        loadData();
        isiTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NimText = new javax.swing.JTextField();
        NamaText = new javax.swing.JTextField();
        AlamatText = new javax.swing.JTextField();
        TambahButton = new javax.swing.JButton();
        UbahButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MahasiswaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nim ");

        jLabel2.setText("Nama ");

        jLabel3.setText("Alamat ");

        NamaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaTextActionPerformed(evt);
            }
        });

        TambahButton.setText("Tambah ");
        TambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahButtonActionPerformed(evt);
            }
        });

        UbahButton.setText("Ubah ");
        UbahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahButtonActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus ");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        MahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(MahasiswaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TambahButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(UbahButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(HapusButton))
                                    .addComponent(AlamatText, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NimText, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(NamaText)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(NimText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AlamatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TambahButton)
                    .addComponent(UbahButton)
                    .addComponent(HapusButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaTextActionPerformed

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahButtonActionPerformed
        // TODO add your handling code here:
        try{
            // TODO add your handling code here: 
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(NimText.getText());
            mhs.setNama(NamaText.getText());
            mhs.setAlamat(AlamatText.getText());
            mhsServis.insert(mhs);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "data tersimpan");
        } catch (SQLException ex){
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TambahButtonActionPerformed

    private void UbahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahButtonActionPerformed
        // TODO add your handling code here:
        try{
            // TODO add your handling code here:
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(NimText.getText());
            mhs.setNama(NamaText.getText());
            mhs.setAlamat(AlamatText.getText());
            mhsServis.update(mhs);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "data berhasil diubah");
        } catch (SQLException ex){
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level. SEVERE, null, ex);
        }
    }//GEN-LAST:event_UbahButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        // TODO add your handling code here:
        try{
            // TODO add your handling code here: 
            String nim = NimText.getText();
            mhsServis.delete(nim);
            this.statusAwal();
            JOptionPane.showMessageDialog(this,"data berhasil dihapus");
        } catch (SQLException ex){
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatText;
    private javax.swing.JButton HapusButton;
    private javax.swing.JTable MahasiswaTable;
    private javax.swing.JTextField NamaText;
    private javax.swing.JTextField NimText;
    private javax.swing.JButton TambahButton;
    private javax.swing.JButton UbahButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
