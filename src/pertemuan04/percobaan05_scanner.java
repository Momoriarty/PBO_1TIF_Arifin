/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

import java.util.Scanner;

/**
 *
 * @author Lab256-14
 */
class Kendaraan {

    String merek;
    int tahun;
    double harga;

    Kendaraan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan merek kendaraan: ");
        this.merek = sc.nextLine();

        System.out.print("Masukkan tahun kendaraan: ");
        this.tahun = sc.nextInt();

        System.out.print("Masukkan harga kendaraan: ");
        this.harga = sc.nextDouble();

    }

    void tampilkanInfo() {
        System.out.println("\nInformasi Kendaraan: ");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: Rp " + harga);
    }
}

public class percobaan05_scanner {

    public static void main(String[] args) {
        Kendaraan mobil1 = new Kendaraan();
        mobil1.tampilkanInfo();
    }
}
