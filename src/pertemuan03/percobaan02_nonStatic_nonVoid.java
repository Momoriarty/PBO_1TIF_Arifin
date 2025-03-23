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
public class percobaan02_nonStatic_nonVoid {

    double hitungLuas(double jr) {
        return Math.PI * jr * jr;
    }

    public static void main(String[] args) {
        percobaan02_nonStatic_nonVoid l1 = new percobaan02_nonStatic_nonVoid();

        double luas = l1.hitungLuas(10);
        System.out.println("Luas Lingkaran : " + luas);
    }
}
