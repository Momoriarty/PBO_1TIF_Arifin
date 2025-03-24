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
class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
    }
}

public class percobaan01_01 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi Santoso";
        mhs1.nim = "220001";
        mhs1.prodi = "Informatika";

        mhs1.tampilkanInfo();
    }
}

