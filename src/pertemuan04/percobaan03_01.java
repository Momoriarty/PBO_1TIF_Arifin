/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

/**
 *
 * @author Lab256-14
 */
class Produk {

    String nama;
    String kode;
    double harga;
    int stok;

    public Produk(String nama, String kode, double harga, int stok) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.stok = stok;
    }

    int totalNilaiStok() {
        return (int) (this.harga * this.stok);
    }

    void tampilkanInfoProduk() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Kode Produk: " + kode);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Total Nilai Stok : Rp.  " + totalNilaiStok());
        System.out.println("-------------------------------------------");
    }

    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }
}

public class percobaan03_01 {

    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop ASUS", "ELK-101", 7500000, 10);
        Produk produk2 = new Produk("Mouse Logitech", "ELK-102", 250000, 30);

        System.out.println("Data Produk Awal");
        produk1.tampilkanInfoProduk();
        produk2.tampilkanInfoProduk();

        System.out.println("Menambahkan stok produk1...");
        produk1.tambahStok(5);

        System.out.println("\nData Produk Setelah Perubahan");
        produk1.tampilkanInfoProduk();
    }
}
