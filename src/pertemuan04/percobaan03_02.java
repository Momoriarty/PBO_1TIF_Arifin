/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04;

/**
 *
 * @author Lab256-14
 */
class AkunBank {

    private String nomorAkun;
    private String namaPemilik;
    private double saldo;
    private String status;

    public AkunBank(String nomorAkun) {
        this.nomorAkun = nomorAkun;
        this.namaPemilik = "Tidak Diketahui";
        this.saldo = 0;
        this.status = "Belum Aktif";
    }

    public AkunBank(String nomorAkun, String namaPemilik) {
        this.nomorAkun = nomorAkun;
        this.namaPemilik = namaPemilik;
        this.saldo = 0;
        this.status = "Belum Aktif";
    }

    public AkunBank(String nomorAkun, String namaPemilik, double saldo) {
        this.nomorAkun = nomorAkun;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.status = "Aktif";
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Akun: " + nomorAkun);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println("Status: " + status);
        System.out.println("--------------------------------------");
    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor uang sebesar " + jumlah + ". Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih besar dari 0.");
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik uang sebesar " + jumlah + ". Saldo sekarang: " + saldo);
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk menarik uang sebesar " + jumlah);
        } else {
            System.out.println("Jumlah tarik harus lebih besar dari 0.");
        }
    }
}

public class percobaan03_02 {

    public static void main(String[] args) {
        AkunBank a1 = new AkunBank("123456789");
        AkunBank a2 = new AkunBank("123456789", "Arifin");
        AkunBank a3 = new AkunBank("123456789", "Arifin", 100000);

        System.out.println("Data Akun");
        a1.tampilkanInfo();
        a2.tampilkanInfo();
        a3.tampilkanInfo();

        System.out.println("Transaksi");
        a3.setorUang(2000000);
        a3.tarikUang(1000000);
        a3.tampilkanInfo();
    }
}
