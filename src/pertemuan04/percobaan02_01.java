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
class MahasiswaArr {
    String nama;
    String nim;
    int[] nilai;

    void tambahData(String nama, String nim, int[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.print("Nilai: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class percobaan02_01 {
    public static void main(String[] args) {
        int[] nilaiBudi = {80, 85, 90}; 
        MahasiswaArr mhs1 = new MahasiswaArr();
        mhs1.tambahData("Arifin", "301030", nilaiBudi);
        mhs1.tampilkanInfo();
    }
}
