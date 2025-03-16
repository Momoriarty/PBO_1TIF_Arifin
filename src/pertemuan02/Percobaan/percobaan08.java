/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02.Percobaan;

/**
 *
 * @author LENOVO
 */
public class percobaan08 {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Arifin";
        mhs.nim = 301030;
        mhs.tampilkaninfo();

        percobaan08_2 rumus = new percobaan08_2();
        System.out.println("Luas Persegi Panjang : " + rumus.luas(10, 5));
        System.out.println("Keliling Persegi Panjang : " + rumus.keliling(10, 5));

    }
}
