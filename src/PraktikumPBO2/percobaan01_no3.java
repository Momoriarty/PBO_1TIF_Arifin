/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO2;

/**
 *
 * @author Lab256-14
 */
public class percobaan01_no3 {

    static double f(double c) {
        return (c * 9 / 5) + 32;
    }

    static double k(double c) {
        return c + 273.15;
    }

    static void pesan(String s, double hasil) {
        System.out.println("Konversi dari Celcius ke " + s + " : " + hasil);
    }

    public static void main(String[] args) {
        int c = 90;

        double f = f(c);
        pesan("Fahrenheit", f);

        double k = k(c);
        pesan("Kelvin", k);
    }
}
