/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
public class percobaan02_02 {

    int saldo;

    void setorUang(int nominal) {
        saldo += nominal;
    }
    void tarikUang(int nominal) {
        if (saldo >= nominal) {
            saldo -= nominal;
        } else {
            System.out.println("Saldo lebih kecil dari nominal yang ingin di tarik.");
        }
    }
    int cekSaldo() {
        return saldo;
    }
    public static void main(String[] args) {
        percobaan02_02 rekening = new percobaan02_02();

        rekening.setorUang(100000);
        rekening.tarikUang(50000);
        System.out.println("Saldo anda saat ini : " + rekening.cekSaldo());
    }
}
