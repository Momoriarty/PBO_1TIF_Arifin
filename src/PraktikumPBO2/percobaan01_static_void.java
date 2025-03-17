/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO2;

/**
 *
 * @author Lab256-14
 */
public class percobaan01_static_void {

    static void cetakPesan() {
        System.out.println("Halo, Selamat datang di java");
    }

    static void CetakPenjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan :" + a + " + " + b + " : " + hasil);
    }

//    non-Void
    static String namaUniv() {
        return "Politeknik Caltex Riau";
    }

    static double cetakJumlah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        cetakPesan();
        CetakPenjumlahan(10, 5);

        String univ = namaUniv();
        System.out.println("Nama Universitas : " + univ);

        double hasil = cetakJumlah(10, 5);
        System.out.println("Hasil " + hasil);
    }
}
