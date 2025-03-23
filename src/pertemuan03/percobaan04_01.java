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
    String jurusan;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jurusan: " + jurusan);
    }

    void ubahJurusan(String jurusanBaru) {
        jurusan = jurusanBaru;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }

    String getInfoMahasiswa() {
        return "Mahasiswa: " + nama + ", Umur: " + umur + ", Jurusan: " + jurusan;
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "Budi Santoso";
        mhs1.umur = 20;
        mhs1.jurusan = "Teknik Informatika";

        mhs1.tampilkanInfo();

        mhs1.ubahJurusan("Sistem Informasi");

        String info = mhs1.getInfoMahasiswa();
        System.out.println(info);
    }
}
