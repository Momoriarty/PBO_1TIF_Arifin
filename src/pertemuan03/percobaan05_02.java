/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class PesertaKursus {
    String namaPeserta;
    String namaKursus;
    int durasiKursus;

    PesertaKursus(String namaPeserta, String namaKursus, int durasiKursus) {
        this.namaPeserta = namaPeserta;
        this.namaKursus = namaKursus;
        this.durasiKursus = durasiKursus;
    }

    void tampilkanInfo() {
        System.out.println("Nama Peserta  : " + this.namaPeserta);
        System.out.println("Nama Kursus   : " + this.namaKursus);
        System.out.println("Durasi Kursus : " + this.durasiKursus + " minggu");
    }

    void perpanjangDurasi(int tambahanMinggu) {
        this.durasiKursus += tambahanMinggu;
        System.out.println("Durasi kursus berhasil diperpanjang menjadi " + this.durasiKursus + " minggu.");
    }

    void cekStatus(int mingguBerjalan) {
        if (mingguBerjalan < durasiKursus) {
            System.out.println("Status: Kursus masih berlangsung (" + (durasiKursus - mingguBerjalan) + " minggu tersisa).");
        } else {
            System.out.println("Status: Kursus telah selesai.");
        }
    }
}

public class percobaan05_02 {
    public static void main(String[] args) {
        PesertaKursus peserta1 = new PesertaKursus("Arifin", "Pemrograman Java", 6);

        peserta1.tampilkanInfo();

        peserta1.perpanjangDurasi(2);

        peserta1.cekStatus(5);

    }
}
