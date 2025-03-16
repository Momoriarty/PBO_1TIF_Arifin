/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan02.Latihan;

import static java.lang.System.*;

import java.util.Scanner;

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

public class BangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        Persegi persegi = new Persegi();
        System.out.print("Sisi : ");
        int sisi = sc.nextInt();
        System.out.println("Luas Persegi: " + persegi.hitungLuas(sisi));
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling(sisi));

        System.out.println("");

        Segitiga segitiga = new Segitiga();
        System.out.print("Alas :");
        int alas = sc.nextInt();
        System.out.print("Tinggi :");
        int tinggi = sc.nextInt();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas(alas, tinggi));
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.print("C : ");
        int c = sc.nextInt();
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling(a, b, c));

        System.out.println("");

        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Jari-jari : ");
        int jr = sc.nextInt();
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas(jr));
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling(jr));
    }
}
