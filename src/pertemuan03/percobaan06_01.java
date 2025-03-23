/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

import java.util.Scanner;

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
        System.out.println("\n=== Detail Peminjaman Buku ===");
        System.out.println("Nama Peminjam : " + namaPeminjam);
        System.out.println("Judul Buku    : " + judulBuku);
        System.out.println("Durasi Pinjam : " + durasiPinjam + " hari");
    }

    void perpanjangPeminjaman(int tambahHari) {
        durasiPinjam += tambahHari;
        System.out.println("Durasi peminjaman diperpanjang menjadi " + durasiPinjam + " hari.");
    }

    void cekStatusPeminjaman(int hariSekarang) {
        if (hariSekarang < durasiPinjam) {
            System.out.println("Status: Buku masih dalam masa peminjaman.");
        } else {
            System.out.println("Status: Buku sudah harus dikembalikan!");
        }
    }
}

public class percobaan06_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama peminjam : ");
        String nama = input.nextLine();
        System.out.print("Masukkan judul buku    : ");
        String judul = input.nextLine();
        System.out.print("Masukkan durasi peminjaman (hari) : ");
        int durasi = input.nextInt();

        PeminjamanBuku pinjam = new PeminjamanBuku(nama, judul, durasi);

        pinjam.tampilkanDetailPeminjaman();

        System.out.print("\nTambahkan hari peminjaman : ");
        int tambahHari = input.nextInt();
        pinjam.perpanjangPeminjaman(tambahHari);

        System.out.print("\nMasukkan jumlah hari berlalu : ");
        int hariSekarang = input.nextInt();
        pinjam.cekStatusPeminjaman(hariSekarang);

        input.close();
    }
}
