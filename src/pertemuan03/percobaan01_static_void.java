/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan03;

/**
 *
 * @author Lab256-14
 */
public class percobaan01_static_void {

    static void cetakPesan() {
        System.out.println("Halo, Selamat datang di java");
    }

    static void CetakPenjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan :" + a + " + " + b + " : " + hasil);
    }

    public static void main(String[] args) {
        cetakPesan();
        CetakPenjumlahan(10, 5);

    }
}
