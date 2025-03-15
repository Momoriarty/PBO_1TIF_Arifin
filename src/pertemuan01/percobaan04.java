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
public class percobaan04 {

    public static void tampilkanPesan() {
        System.out.println("Selamat Belajar Java!");
    }

    public static void data(String nama, String nim, String jurusan) {
        System.out.println("==== Data Mahasiswa =======");
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("==============================");
    }

    public static void angka(int n) {
        System.out.println("Deret angka 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        tampilkanPesan();

        data("Arifin", "2455301030", "Teknik Informatika");
        angka(5);
        angka(10);

    }

}
