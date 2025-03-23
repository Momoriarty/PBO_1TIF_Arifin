/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan03;

/**
 *
 * @author Lab256-14
 */
public class percobaan01_no2 {

    static double tambah(int a, int b) {
        return a + b;
    }

    static double kurang(int a, int b) {
        return a - b;
    }

    static double kali(int a, int b) {
        return a * b;
    }

    static void pesan(String aritmatika, double hasil) {
        System.out.println("Hasil " + aritmatika + " : " + hasil);
    }

    public static void main(String[] args) {
        double hasilTambah = tambah(10, 5);
        pesan("Penjumlahan", hasilTambah);

        double hasilKurang = kurang(10, 5);
        pesan("Penjumlahan", hasilKurang);

        double hasilKali = kali(10, 5);
        pesan("Penjumlahan", hasilKali);
    }
}
