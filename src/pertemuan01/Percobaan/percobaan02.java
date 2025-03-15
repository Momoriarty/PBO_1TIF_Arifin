/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan01.Percobaan;

/**
 *
 * @author Lab256-14
 */
public class percobaan02 {
    public static void sapaPengguna() {
        System.out.println("Halo, Selamat datang di pemograman Java!");
    }

    public static void menuMakanan() {
        System.out.println("==== Menu Makanan ===="
                + "\n 1. Nasi Goreng"
                + "\n 2. Mie Ayam"
                + "\n 3. Soto ayam"
                + "\n 4. Bakso"
                + "\n ======================");
    }

    public static void angkaGenap() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        sapaPengguna();
        System.out.println("");
        menuMakanan();
        System.out.println("");
        angkaGenap();
    }
}
