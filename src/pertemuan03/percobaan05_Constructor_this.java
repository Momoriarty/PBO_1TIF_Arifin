/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class MahasiswaP4 {

    String nama;
    int umur;

    MahasiswaP4(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }
}

public class percobaan05_Constructor_this {

    public static void main(String[] args) {
        MahasiswaP4 mhs1 = new MahasiswaP4("Fajar", 22);
        mhs1.tampilkanInfo();
    }
}
