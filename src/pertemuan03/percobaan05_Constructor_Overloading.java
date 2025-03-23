/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class MahasiswaKe3 {
    String nama;
    int umur;

    MahasiswaKe3() {
        nama = "Tidak Diketahui";
        umur = 0;
    }
    MahasiswaKe3(String namaMhs) {
        nama = namaMhs;
        umur = 18;
    }
    MahasiswaKe3(String namaMhs, int umurMhs) {
        nama = namaMhs;
        umur = umurMhs;
    }
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
public class percobaan05_Constructor_Overloading {

    public static void main(String[] args) {
        MahasiswaKe3 mhs1 = new MahasiswaKe3();
        mhs1.tampilkanInfo();

        MahasiswaKe3 mhs2 = new MahasiswaKe3("Dina");
        mhs2.tampilkanInfo();

        MahasiswaKe3 mhs3 = new MahasiswaKe3("Eko", 21);
        mhs3.tampilkanInfo();
    }
}
