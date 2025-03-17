/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan03;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Lab256-14
 */
public class BangunDatar {

    public static double LuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static double KelilingPersegi(int sisi) {
        return 4 * sisi;
    }

    public static double LuasSegitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double KelilingSegitiga(int a, int b, int c) {
        return a + b + c;
    }

    public static double LuasLingkaran(int jr) {
        return Math.PI * jr * jr;
    }

    public static double KelilingLingkaran(int jr) {
        return 2 * Math.PI * jr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.print("Sisi : ");
        int sisi = sc.nextInt();
        System.out.println("Luas Persegi: " + LuasPersegi(sisi));
        System.out.println("Keliling Persegi: " + KelilingPersegi(sisi));

        System.out.println("");

        System.out.print("Alas :");
        int alas = sc.nextInt();
        System.out.print("Tinggi :");
        int tinggi = sc.nextInt();
        System.out.println("Luas Segitiga: " + LuasSegitiga(alas, tinggi));
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.print("C : ");
        int c = sc.nextInt();
        System.out.println("Keliling Segitiga: " + KelilingSegitiga(a, b, c));

        System.out.println("");

        System.out.println("Jari-jari : ");
        int jr = sc.nextInt();
        System.out.println("Luas Lingkaran: " + LuasLingkaran(jr));
        System.out.println("Keliling Lingkaran: " + KelilingLingkaran(jr));
    }
}
