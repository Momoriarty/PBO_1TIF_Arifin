/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

/**
 *
 * @author Lab256-14
 */
class suhu {

    double nilai;

    suhu(double nilai) {
        this.nilai = nilai;
    }

    void cekKondisi() {
        System.out.print("Kondisi Suhu " + nilai + " Adalah :");
        if (nilai >= 30) {
            System.out.println("Cuaca Panas!");
        } else if (nilai >= 20) {
            System.out.println("Cuaca Sejuk!");
        } else {
            System.out.println("Cuaca Dingin!");
        }
    }
}

class bilangan {

    int batas;

    bilangan(int batas) {
        this.batas = batas;
    }

    void cetakBilangan() {
        System.out.println("Perulangan 1 sampai " + batas + " adalah : ");
        for (int i = 1; i < batas; i++) {
            System.out.print(i + " ");
        }
    }
}

class pencarian {

    int[] angka = {10, 20, 30, 40, 50};

    void cariAngka(int cari) {
        for (int n : angka) {
            if (n == cari) {
                System.out.println("Angka Ditemukan : " + n);
                break;
            }
        }
    }
}

public class percobaan04_01 {

    public static void main(String[] args) {
        suhu suhu = new suhu(32);
        suhu.cekKondisi();

        System.out.println("");
        bilangan bilangan = new bilangan(5);
        bilangan.cetakBilangan();

        System.out.println("");
        System.out.println("");
        pencarian pencarian = new pencarian();
        pencarian.cariAngka(30);
    }
}
