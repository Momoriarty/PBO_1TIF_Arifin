package pertemuan03;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lab256-14
 */
class Mhs {

    String nama;
    int nilai;

    public String grade() {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 70 && nilai <= 79) {
            return "B";
        } else if (nilai >= 60 && nilai <= 69) {
            return "C";
        } else if (nilai >= 50 && nilai <= 59) {
            return "D";
        } else {
            return "E";
        }
    }

    void tampilkanHasil() {
        String grade = grade();
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
    }
}

public class Mahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mhs mhs = new Mhs();
        String nama;
        int nilai;

        System.out.print("Input Nama : ");
        mhs.nama = nama = sc.nextLine();

        System.out.print("Input Nilai : ");
        mhs.nilai = nilai = sc.nextInt();

        System.out.println("");
        mhs.tampilkanHasil();
    }
}
