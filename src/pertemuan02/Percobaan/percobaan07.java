/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan02.Percobaan;

/**
 *
 * @author Lab256-14
 */
public class percobaan07 {

    class Mobil {
        void tampilkanMerek() {
            System.out.println("Merek mobil : Toyota");
        }
    }
    
    public static void main(String[] args) {

        percobaan07 garasi = new percobaan07();
        percobaan07.Mobil mobil = garasi.new Mobil();
        mobil.tampilkanMerek();
    }
}
