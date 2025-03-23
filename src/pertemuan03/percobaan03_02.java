/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class persegiPanjang {

    double panjang = 5;
    double lebar = 2;

    double hitungLuas() {
        double hasil = panjang * lebar;
        return hasil;
    }

    void hitungKeliling() {
        double hasil = 2 * (panjang + lebar);
        System.out.println("Keliling : " + hasil);
    }
}

public class percobaan03_02 {

    public static void main(String[] args) {
        persegiPanjang p1 = new persegiPanjang();
        persegiPanjang p2 = new persegiPanjang();

        p1.panjang = 10;
        p1.lebar = 5;

        System.out.println("Persegi panjang 1: "
                + "\n Panjang   : " + p1.panjang + " cm"
                + "\n Lebar     : " + p1.lebar + "cm"
                + "\n Luas Persegi Panjang : " + p1.hitungLuas() + " cm");
        p1.hitungKeliling();

        System.out.println("===================================================");

        System.out.println("Persegi panjang 2: "
                + "\n Panjang   : " + p2.panjang + " cm"
                + "\n Lebar     : " + p2.lebar + "cm"
                + "\n Luas Persegi Panjang : " + p2.hitungLuas() + " cm");
        p2.hitungKeliling();
    }
}
