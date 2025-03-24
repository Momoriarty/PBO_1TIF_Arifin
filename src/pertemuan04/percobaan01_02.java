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
class Pegawai {

    String nama;
    String idPegawai;
    double gaji;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

public class percobaan01_02 {

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.nama = "Alice";
        pegawai1.idPegawai = "1";
        pegawai1.gaji = 5000000;

        Pegawai pegawai2 = new Pegawai();
        pegawai2.nama = "Bob";
        pegawai2.idPegawai = "2";
        pegawai2.gaji = 6000000;

        System.out.println("Informasi Pegawai 1:");
        pegawai1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Pegawai 2:");
        pegawai2.tampilkanInfo();
        System.out.println();

        double totalGaji = pegawai1.gaji + pegawai2.gaji;
        System.out.println("Total Gaji dari kedua pegawai: " + totalGaji);
    }
}
