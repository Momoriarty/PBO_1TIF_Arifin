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
public class percobaan01 {

    public static void printKata() {
        System.out.println("Hai");
    }

    public static void motivasi() {
        System.out.println("Saya akan menguasai konsep Praktikum Pemrograman Object");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        printKata();
        motivasi();
        int result = add(1, 99);
        System.out.println("Hasil Penjumlahan : " + result);
    }
}
