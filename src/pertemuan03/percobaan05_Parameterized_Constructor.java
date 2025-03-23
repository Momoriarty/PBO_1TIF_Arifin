/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class MahasiswaKe2 {

    String nama;
    int umur;

    MahasiswaKe2(String namaMhs, int umurMhs) {
        nama = namaMhs;
        umur = umurMhs;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class percobaan05_Parameterized_Constructor {

    public static void main(String[] args) {
        MahasiswaKe2 mhs1 = new MahasiswaKe2("Budi", 20);
        mhs1.tampilkanInfo();
    }
}
