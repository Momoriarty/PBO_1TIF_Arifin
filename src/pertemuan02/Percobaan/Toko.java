/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02.Percobaan;

/**
 *
 * @author LENOVO
 */
//Percobaan 7
public class Toko {

    class Laptop {

        void tampilkanSpesifikasi(String merek, double harga) {
            System.out.println("Merek: " + merek + ", Harga: Rp " + harga);
        }
    }

    public static void main(String[] args) {
        Toko tk = new Toko();
        Toko.Laptop laptop = tk.new Laptop();
        laptop.tampilkanSpesifikasi("Lenovo", 1200000);
        laptop.tampilkanSpesifikasi("Asus", 1300000);

    }
}
