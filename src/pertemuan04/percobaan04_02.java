/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

/**
 *
 * @author Lab256-14
 */
class Karyawan {

    String nama;
    int gaji, hari, totalGaji;

    Karyawan(String nama, int gaji, int hari) {
        this.gaji = gaji;
        this.nama = nama;
        this.hari = hari;

    }

    void tampilkanGaji() {
        this.totalGaji = gaji * hari;
        System.out.println("======== Data Karyawan =======");
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Harian : " + gaji);
        System.out.println("Hari Kerja : " + hari);
        System.out.println("Total Gaji: Rp." + totalGaji);
        System.out.println("======================================");
    }

}

public class percobaan04_02 {

    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Siti Susanti", 200000, 22);
        Karyawan k2 = new Karyawan("Joko Ardodo", 200000, 18);

        k1.tampilkanGaji();
        k2.tampilkanGaji();
    }

}
