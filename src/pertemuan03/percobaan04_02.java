/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */

class Kendaraan {

    String merek;
    int tahunProduksi;
    String warna;
    int tahunSaatIni = 2025;

    void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
    }
    void ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna kendaraan berhasil diubah menjadi: " + warna);
    }
    int hitungUsia() {
        return tahunSaatIni - tahunProduksi;
    }
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();

        mobil.merek = "Toyota";
        mobil.tahunProduksi = 2018;
        mobil.warna = "Hitam";
        mobil.tampilkanInfo();

        mobil.ubahWarna("Merah");

        int umur = mobil.hitungUsia();
        System.out.println("Umur Kendaraan: " + umur + " tahun");
    }
}
