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
public class MenuBuku extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    public MenuBuku() {
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
        TblBuku = new javax.swing.JTable();
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

        TblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul", "Penulis", "Penerbit", "Tahun Terbit"
            }
        ));
        jScrollPane1.setViewportView(TblBuku);
        TblBuku.getAccessibleContext().setAccessibleParent(TblBuku);

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
        jLabel1.setText("Data Peminjaman Buku");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                   
    int selectedRow = TblBuku.getSelectedRow();
    if (selectedRow != -1) {
        // Mendapatkan data dari baris yang dipilih
        String id_buku = (String) tableModel.getValueAt(selectedRow, 0);
        String judul = (String) tableModel.getValueAt(selectedRow, 1);
        String penulis = (String) tableModel.getValueAt(selectedRow, 2);
        String penerbit = (String) tableModel.getValueAt(selectedRow, 3);
        String tahun_terbit = (String) tableModel.getValueAt(selectedRow, 4);
        
     // Menampilkan dialog untuk mengedit data
    String newIdBuku = JOptionPane.showInputDialog(this, "Edit ID Buku:", id_buku);
    String newJudul = JOptionPane.showInputDialog(this, "Edit Judul Buku:", judul);
    String newPenulis = JOptionPane.showInputDialog(this, "Edit Penulis:", penulis);
    String newPenerbit = JOptionPane.showInputDialog(this, "Edit Penerbit:", penerbit);
    String newTahunTerbit = JOptionPane.showInputDialog(this, "Edit Tahun Terbit:", tahun_terbit);

    if (newIdBuku != null && newJudul != null && newPenulis != null && newPenerbit != null && newTahunTerbit != null) {
        // Update data di tabel
        tableModel.setValueAt(newIdBuku, selectedRow, 0);
        tableModel.setValueAt(newJudul, selectedRow, 1);
        tableModel.setValueAt(newPenulis, selectedRow, 2);
        tableModel.setValueAt(newPenerbit, selectedRow, 3);
        tableModel.setValueAt(newTahunTerbit, selectedRow, 4);

        // Update data di database
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            String query = "UPDATE buku SET id_buku = ?, judul = ?, penulis = ?, penerbit = ?, tahun_terbit = ? WHERE id_buku = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, newIdBuku);
            ps.setString(2, newJudul);
            ps.setString(3, newPenulis);
            ps.setString(4, newPenerbit);
            ps.setString(5, newTahunTerbit);
            ps.setString(6, id_buku);  // Kondisi untuk mencari data asli
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data buku berhasil diperbarui.");
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
    int selectedRow = TblBuku.getSelectedRow();
    if (selectedRow != -1) {
        // Mendapatkan ID untuk data yang akan dihapus
        String id_buku = (String) tableModel.getValueAt(selectedRow, 0);
        String judul = (String) tableModel.getValueAt(selectedRow, 1);
        String penulis = (String) tableModel.getValueAt(selectedRow, 2);
        String penerbit = (String) tableModel.getValueAt(selectedRow, 3);
        String tahun_terbit = (String) tableModel.getValueAt(selectedRow, 4);

        // Menampilkan dialog konfirmasi
        int confirmation = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus data buku ini?", 
            "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
        // Menghapus data dari database
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            String query = "DELETE FROM buku WHERE id_buku = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id_buku);
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                // Menghapus baris dari tabel jika penghapusan berhasil di database
                tableModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Data buku berhasil dihapus dari database.");
            } else {
                JOptionPane.showMessageDialog(this, "Data buku tidak ditemukan di database.");
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
       new TambahBuku().setVisible(true);
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       this.setVisible(false);  // Close this form
       new MenuDasboard().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MenuBuku().setVisible(true));
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
            java.util.logging.Logger.getLogger(MenuBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                new MenuBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblBuku;
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
        // Menghubungkan ke database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
        
        // Query untuk mengambil data dari tabel buku
        String query = "SELECT id_buku, judul, penulis, penerbit, tahun_terbit FROM buku";
        
        // Menyiapkan statement dan eksekusi query
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        // Menentukan model tabel yang digunakan
        tableModel = (DefaultTableModel) TblBuku.getModel();
        
        // Mengosongkan tabel sebelum menambahkan data baru
        tableModel.setRowCount(0);
        
        // Menambahkan data ke dalam tabel
        while (rs.next()) {
            tableModel.addRow(new Object[]{
                rs.getString("id_buku"),   // ID Buku
                rs.getString("judul"),     // Judul Buku
                rs.getString("penulis"),   // Penulis Buku
                rs.getString("penerbit"),  // Penerbit Buku
                rs.getString("tahun_terbit") // Tahun Terbit Buku
            });
        }
    } catch (SQLException e) {
        // Menangani error jika terjadi kesalahan dalam eksekusi
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
}
