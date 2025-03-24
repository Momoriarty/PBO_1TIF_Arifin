/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab256-14
 */
class MahasiswaArr1 {

    String nama;
    int nim;
    int[] nilai;

    void tambahData(String nama, int nim, int[] nilai) {
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

public class percobaan02_02 {

    public static void main(String[] args) {
        String nama;
        int nim, nilai[] = new int[5];
        nama = JOptionPane.showInputDialog("Input Nama");
        nim = Integer.parseInt(JOptionPane.showInputDialog("Input Nim"));
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai ke-" + (i + 1)));
        }
        MahasiswaArr1 mhs1 = new MahasiswaArr1();
        mhs1.tambahData(nama, nim, nilai);
        mhs1.tampilkanInfo();
    }
}
