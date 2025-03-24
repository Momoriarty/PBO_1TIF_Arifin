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
class Siswa {

    // Atribut
    String nama;
    int usia;
    double nilai;

    Siswa() {
        this.nama = JOptionPane.showInputDialog("Masukkan nama siswa:");
        this.usia = Integer.parseInt(JOptionPane.showInputDialog("Masukkan usia siswa:"));
        this.nilai = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai ujian siswa: "));
    }

    void tampilkanInfo() {
        String info = "Nama: " + nama + "\nUsia: " + usia + "\nNilai: " + nilai;
        JOptionPane.showMessageDialog(null, info, "Informasi Siswa", JOptionPane.INFORMATION_MESSAGE);
    }

    void cekKelulusan() {
        String status = (nilai > 60) ? "LULUS" : "TIDAK LULUS";
        JOptionPane.showMessageDialog(null, "Status Kelulusan: " + status);
    }
}

public class percobaan05_jpane {

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();

        siswa1.tampilkanInfo();

        siswa1.cekKelulusan();
    }
}
