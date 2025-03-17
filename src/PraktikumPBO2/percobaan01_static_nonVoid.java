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
public class percobaan01_static_nonVoid {

    static String namaUniv() {
        return "Politeknik Caltex Riau";
    }

    static double cetakJumlah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        String univ = namaUniv();
        System.out.println("Nama Universitas : " + univ);

        double hasil = cetakJumlah(10, 5);
        System.out.println("Hasil " + hasil);
    }
}
