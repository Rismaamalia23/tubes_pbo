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
public class MenuAdmin extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    public MenuAdmin() {
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
        TblAdmin = new javax.swing.JTable();
        btnTambah1 = new javax.swing.JButton();
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

        TblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Admin", "Nama", "Password"
            }
        ));
        jScrollPane1.setViewportView(TblAdmin);
        TblAdmin.getAccessibleContext().setAccessibleParent(TblAdmin);

        btnTambah1.setBackground(new java.awt.Color(255, 204, 204));
        btnTambah1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah1.setText("Tambah");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Admin Perpustakaan");

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
                            .addComponent(btnTambah1)
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
                    .addComponent(btnTambah1)
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
    int selectedRow = TblAdmin.getSelectedRow();
    if (selectedRow != -1) {
    // Mendapatkan data dari baris yang dipilih
        String id_petugas = (String) tableModel.getValueAt(selectedRow, 0);
        String nama = (String) tableModel.getValueAt(selectedRow, 1);
        String password = (String) tableModel.getValueAt(selectedRow, 2);

        // Menampilkan dialog untuk mengedit data
        String newIdPetugas = JOptionPane.showInputDialog(this, "Edit ID Petugas:", id_petugas);
        String newNama = JOptionPane.showInputDialog(this, "Edit Nama:", nama);
        String newPassword = JOptionPane.showInputDialog(this, "Edit Password:", password);

    if (newIdPetugas != null && newNama != null && newPassword != null) {
        // Update data di tabel
        tableModel.setValueAt(newIdPetugas, selectedRow, 0);
        tableModel.setValueAt(newNama, selectedRow, 1);
        tableModel.setValueAt(newPassword, selectedRow, 2);

        // Update data di database
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            String query = "UPDATE admin SET id_petugas = ?, nama = ?, password = ? WHERE id_petugas = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, newIdPetugas);
            ps.setString(2, newNama);
            ps.setString(3, newPassword);
            ps.setString(4, id_petugas); // Kondisi untuk mencari data asli berdasarkan id_petugas
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
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
    int selectedRow = TblAdmin.getSelectedRow();
    if (selectedRow != -1) {
        // Mendapatkan ID untuk data yang akan dihapus
        String id_petugas = (String) tableModel.getValueAt(selectedRow, 0);
        String nama = (String) tableModel.getValueAt(selectedRow, 1);
        String password = (String) tableModel.getValueAt(selectedRow, 2);

        // Menampilkan dialog konfirmasi
        int confirmation = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus data admin ini?", 
            "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
        // Menghapus data dari database
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            String query = "DELETE FROM admin WHERE id_petugas = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id_petugas);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                // Menghapus baris dari tabel jika penghapusan berhasil di database
                tableModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Data admin berhasil dihapus dari database.");
            } else {
                JOptionPane.showMessageDialog(this, "Data admin tidak ditemukan di database.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
} else {
    JOptionPane.showMessageDialog(this, "Silakan pilih baris data yang ingin dihapus.");
}

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
       this.setVisible(false);  // Close this form
       new TambahAdmin().setVisible(true);
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       this.setVisible(false);  // Close this form
       new MenuDasboard().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MenuAdmin().setVisible(true));
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblAdmin;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    public void loadData(){
    try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
    String query = "SELECT id_petugas, nama, password FROM admin";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    tableModel = (DefaultTableModel) TblAdmin.getModel();
    tableModel.setRowCount(0);
    while (rs.next()) {
        tableModel.addRow(new Object[]{
            rs.getString("id_petugas"),
            rs.getString("nama"),
            rs.getString("password")
        });
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }
}
