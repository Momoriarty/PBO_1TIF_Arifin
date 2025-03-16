/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan02.Latihan;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

class Mhs {

    String nama;
    double nilai;

    public String tentukanGrade() {
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
        String grade = tentukanGrade();
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
    }
}

public class Mahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = sc.nextDouble();

        Mhs mhs = new Mhs();
        mhs.nama = nama;
        mhs.nilai = nilai;
        mhs.tampilkanHasil();

        sc.close();
    }
}
