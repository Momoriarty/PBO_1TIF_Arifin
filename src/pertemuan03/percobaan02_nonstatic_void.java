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
public class percobaan02_nonstatic_void {

    String merk = "Toyota";
    int kecepatan;

    void tambahKecepetan(int nilai) {
        kecepatan += nilai;
        System.out.println("Kecepetan " + merk + " sekarang : " + kecepatan + " Km/Jam");
    }

    public static void main(String[] args) {
        percobaan02_nonstatic_void spd = new percobaan02_nonstatic_void();

        spd.tambahKecepetan(20);
        spd.tambahKecepetan(30);

    }
}
