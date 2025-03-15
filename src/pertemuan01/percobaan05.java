/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan01;

import static pertemuan01.percobaan01.motivasi;

/**
 *
 * @author Lab256-14
 */
public class percobaan05 {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int hasil = tambah(1, 99);
        System.out.println("Hasil Penjumlahan : " + hasil);

        double avg = avg(80, 75, 90);
        System.out.println("Rata-rata dari nilai 80,75,90 adalah " + avg);

        int max = max(45, 78);
        System.out.println("Bilangan Terbesar antara 45 dan 78 adalah : " + max);
    }
}
