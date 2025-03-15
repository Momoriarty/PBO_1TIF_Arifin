/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan01;

/**
 *
 * @author Lab256-14
 */
class mahasiswa {

    String nama;
    int nim;

    void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
    }

    String tampilkanInfo1(String nama, int nim) {
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        return "";
    }

}

class persegiPanjang {

    int panjang, lebar;

    void hitungLuas() {
        System.out.println("Luas : " + panjang * lebar);
    }

    void hitungKeliling() {
        System.out.println("Keliling : " + 2 * (panjang + lebar));
    }
}

public class percobaan06 {

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.nama = "Arifin";
        mhs1.nim = 301030;
        mhs1.tampilkanInfo();

        System.out.println("");
        mhs1.tampilkanInfo1("Arifin", 245531030);
        System.out.println("");

        persegiPanjang pp = new persegiPanjang();
        pp.panjang = 10;
        pp.lebar = 10;
        pp.hitungLuas();
        pp.hitungKeliling();

    }
}
