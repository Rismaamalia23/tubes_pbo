/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpustakaan;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class MenuPengembalian extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    public MenuPengembalian() {
        initComponents();
        loadData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPengembalian = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        btnEdit.setBackground(new java.awt.Color(255, 204, 204));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 0, 0));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        TblPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Pengembalian", "ID Peminjaman", "ID Anggota", "Tanggal Peminjaman", "Tanggal Pengembalian", "Denda"
            }
        ));
        jScrollPane1.setViewportView(TblPengembalian);
        TblPengembalian.getAccessibleContext().setAccessibleParent(TblPengembalian);

        btnTambah.setBackground(new java.awt.Color(255, 204, 204));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Pengembalian Buku");

        btnKembali.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(102, 102, 102));
        btnKembali.setText("< Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnTambah)
                            .addGap(18, 18, 18)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnKembali))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
                                   
    int selectedRow = TblPengembalian.getSelectedRow();
    if (selectedRow != -1) {
        // Mendapatkan data dari baris yang dipilih
        String id_pengembalian = (String) tableModel.getValueAt(selectedRow, 0);
        String id_peminjaman = (String) tableModel.getValueAt(selectedRow, 1);
        String id_anggota = (String) tableModel.getValueAt(selectedRow, 2);
        String waktu_peminjaman = (String) tableModel.getValueAt(selectedRow, 3);
        String waktu_pengembalian = (String) tableModel.getValueAt(selectedRow, 4);
        String denda = (String) tableModel.getValueAt(selectedRow, 5);

        // Menampilkan dialog untuk mengedit data
        String newid_pengembalian = JOptionPane.showInputDialog(this, "Edit ID Pengembalian:", id_pengembalian);
        String newid_peminjaman = JOptionPane.showInputDialog(this, "Edit ID Peminjaman:", id_peminjaman);
        String newid_anggota = JOptionPane.showInputDialog(this, "Edit ID Anggota:", id_anggota);
        String newwaktu_peminjaman = JOptionPane.showInputDialog(this, "Edit Tanggal Peminjaman:", waktu_peminjaman);
        String newwaktu_pengembalian = JOptionPane.showInputDialog(this, "Edit Tanggal Pengembalian:", waktu_pengembalian);
        String newdenda = JOptionPane.showInputDialog(this, "Edit Jumlah Denda:", denda);

        if (newid_pengembalian != null && newid_peminjaman != null && newid_anggota != null &&
            newwaktu_peminjaman != null && newwaktu_pengembalian != null && newdenda != null) {
            // Update data di tabel
            tableModel.setValueAt(newid_pengembalian, selectedRow, 0);
            tableModel.setValueAt(newid_peminjaman, selectedRow, 1);
            tableModel.setValueAt(newid_anggota, selectedRow, 2);
            tableModel.setValueAt(newwaktu_peminjaman, selectedRow, 3);
            tableModel.setValueAt(newwaktu_pengembalian, selectedRow, 4);
            tableModel.setValueAt(newdenda, selectedRow, 5);

            // Update data di database
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
                 PreparedStatement ps = con.prepareStatement(
                     "UPDATE pengembalian SET id_pengembalian = ?, id_peminjaman = ?, id_anggota = ?, waktu_peminjaman = ?, waktu_pengembalian = ?, denda = ? WHERE id_pengembalian = ?")) {
                
                ps.setString(1, newid_pengembalian);
                ps.setString(2, newid_peminjaman);
                ps.setString(3, newid_anggota);
                ps.setString(4, newwaktu_peminjaman);
                ps.setString(5, newwaktu_pengembalian);
                ps.setString(6, newdenda);
                ps.setString(7, id_pengembalian); // Data lama untuk identifikasi

                int rowsUpdated = ps.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal memperbarui data di database.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Edit dibatalkan.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Silakan pilih baris data yang ingin diedit.");
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    int selectedRow = TblPengembalian.getSelectedRow();
    if (selectedRow != -1) {
        // Mendapatkan ID untuk data yang akan dihapus
        String id_pengembalian = (String) tableModel.getValueAt(selectedRow, 1);
        String id_peminjaman = (String) tableModel.getValueAt(selectedRow, 2);
        String id_anggota= (String) tableModel.getValueAt(selectedRow, 3);
        String waktu_peminjaman = (String) tableModel.getValueAt(selectedRow, 4);
        String waktu_pengembalian= (String) tableModel.getValueAt(selectedRow, 5);
        String denda = (String) tableModel.getValueAt(selectedRow, 6);
        
        // Menampilkan dialog konfirmasi
        int confirmation = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus data ini?", 
            "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            // Menghapus data dari database
            // Update data di database
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
                 PreparedStatement ps = con.prepareStatement(
                     "DELETE pengembalian SET id_pengembalian = ?, id_peminjaman = ?, id_anggota = ?, waktu_peminjaman = ?, waktu_pengembalian = ?, denda = ? WHERE id_pengembalian = ?")) {
                
                ps.setString(1, id_pengembalian);
                ps.setString(2, id_peminjaman);
                ps.setString(3, id_anggota);
                ps.setString(4, waktu_peminjaman);
                ps.setString(5, waktu_pengembalian);
                ps.setString(6, denda);
                int rowsAffected = ps.executeUpdate();
                
                if (rowsAffected > 0) {
                    // Menghapus baris dari tabel jika penghapusan berhasil di database
                    tableModel.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus dari database.");
                } else {
                    JOptionPane.showMessageDialog(this, "Data tidak ditemukan di database.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Silakan pilih baris data yang ingin dihapus.");
    }

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       this.setVisible(false);  // Close this form
       new TambahPengembalian().setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       this.setVisible(false);  // Close this form
       new MenuDasboard().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MenuPengembalian().setVisible(true));
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
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblPengembalian;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    public void loadData(){
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
        String query = "SELECT id_pengembalian, id_peminjaman, id_anggota, waktu_peminjaman, waktu_pengembalian, denda FROM pengembalian";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        tableModel = (DefaultTableModel) TblPengembalian.getModel();
        tableModel.setRowCount(0);
        while (rs.next()) {
            tableModel.addRow(new Object[]{
                rs.getString("id_pengembalian"),
                rs.getString("id_peminjaman"),
                rs.getString("id_anggota"),
                rs.getString("waktu_peminjaman"),
                rs.getString("waktu_pengembalian"),
                rs.getString("denda"),
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }
}
