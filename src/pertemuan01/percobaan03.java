/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan01;

/**
 *
 * @author Lab256-14
 */
public class percobaan03 {

    public static void sapa(String nama) {
        System.out.println("Halo, " + nama + "! Selamat datang di program Java");
    }

    public static void luas(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah : " + luas);
    }

    public static void totalHarga(int jumlah, int satuan) {
        int totalharga = jumlah * satuan;
        System.out.println("Total Harga untuk " + jumlah + " barang adalah : " + totalharga);
    }

    public static void main(String[] args) {
        sapa("Arifin");
        luas(4);
        luas(7);
        totalHarga(3, 50000);
    }
}
