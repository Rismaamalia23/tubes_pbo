/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Peminjaman {
    private String nama;
    private String id_anggota;
    private int nim;
    private String judul_buku;
    private String id_buku;
    private String waktu_peminjaman;
    private String waktu_pengembalian;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getWaktu_peminjaman() {
        return waktu_peminjaman;
    }

    public void setWaktu_peminjaman(String waktu_peminjaman) {
        this.waktu_peminjaman = waktu_peminjaman;
    }

    public String getWaktu_pengembalian() {
        return waktu_pengembalian;
    }

    public void setWaktu_pengembalian(String waktu_pengembalian) {
        this.waktu_pengembalian = waktu_pengembalian;
    }

    
}
