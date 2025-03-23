/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class Mahasiswa {

    String nama;
    int umur;

    Mahasiswa() {
        nama = "Tidak Diketahui";
        umur = 0;
        System.out.println("Constructor Default Dipanggil!");
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class percobaan05_Constructor_Default {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanInfo();
    }
}
