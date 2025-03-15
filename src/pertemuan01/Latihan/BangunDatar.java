/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan01.Latihan;

/**
 *
 * @author Lab256-14
 */
class Persegi {
    double hitungLuas(int sisi) {
        return sisi * sisi;
    }
    double hitungKeliling(int sisi) {
        return 4 * sisi;
    }
}

class Segitiga {
    double hitungLuas(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }
    double hitungKeliling(int a, int b, int c) {
        return a + b + c;
    }
}

class Lingkaran {
    double hitungLuas(int jr) {
        return Math.PI * jr * jr;
    }
    double hitungKeliling(int jr) {
        return 2 * Math.PI * jr;
    }
}

// Main Class untuk Pengujian
public class BangunDatar {
    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        System.out.println("Luas Persegi: " + persegi.hitungLuas(4));
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling(5));

        System.out.println("");

        Segitiga segitiga = new Segitiga();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas(5, 8));
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling(6, 7, 8));

        System.out.println("");

        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas(8));
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling(9));
    }
}
