/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
class PeminjamanBuku {

    String namaPeminjam;
    String judulBuku;
    int durasiPinjam;

    PeminjamanBuku(String namaPeminjam, String judulBuku, int durasiPinjam) {
        this.namaPeminjam = namaPeminjam;
        this.judulBuku = judulBuku;
        this.durasiPinjam = durasiPinjam;
    }

    void tampilkanDetailPeminjaman() {
        JOptionPane.showMessageDialog(null, "=== Detail Peminjaman Buku ===\n"
                + "Nama Peminjam : " + namaPeminjam + "\n"
                + "Judul Buku    : " + judulBuku + "\n"
                + "Durasi Pinjam : " + durasiPinjam + " hari");
    }

    void perpanjangPeminjaman(int tambahHari) {
        durasiPinjam += tambahHari;
        JOptionPane.showMessageDialog(null, "Durasi peminjaman diperpanjang menjadi " + durasiPinjam + " hari.");
    }

    void cekStatusPeminjaman(int hariSekarang) {
        String status = (hariSekarang < durasiPinjam) ? "Buku masih dalam masa peminjaman." : "Buku sudah harus dikembalikan!";
        JOptionPane.showMessageDialog(null, "Status: " + status);
    }
}

public class percobaan06_02 {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama peminjam:");
        String judul = JOptionPane.showInputDialog("Masukkan judul buku:");
        int durasi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan durasi peminjaman (hari):"));

        PeminjamanBuku pinjam = new PeminjamanBuku(nama, judul, durasi);

        pinjam.tampilkanDetailPeminjaman();

        int tambahHari = Integer.parseInt(JOptionPane.showInputDialog("Tambahkan hari peminjaman:"));
        pinjam.perpanjangPeminjaman(tambahHari);

        int hariSekarang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah hari berlalu:"));
        pinjam.cekStatusPeminjaman(hariSekarang);
    }
}
