/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
class makalah {

    String judul;

    void infoMakalah() {
        System.out.println("Judul Makalah : " + judul);
    }
}

public class percobaan03_behavior {

    public static void main(String[] args) {
        makalah m1 = new makalah();
        makalah m2 = new makalah();

        m1.judul = "PBO";
        m2.judul = "ALPRO";

        m1.infoMakalah();
        m2.infoMakalah();
    }
}
