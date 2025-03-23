/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author LENOVO
 */
public class percobaan02_03 {

    int tugas, uas, uts;
    void inputNilai(int tugas, int uas, int uts) {
        this.tugas = tugas;
        this.uas = uas;
        this.uts = uts;
    }
    void tampilkanNilai() {
        System.out.println("Nilai Mahasiswa A :"
                + "\n Tugas : " + tugas
                + "\n UAS : " + uas
                + "\n UTS : " + uts);
    }
    double nilaiAkhir() {
        tugas = (int) (tugas * 0.3);
        uas = (int) (uas * 0.3);
        uts = (int) (uts * 0.3);

        int hasil = tugas + uas + uts;
        return hasil;
    }
    public static void main(String[] args) {
        percobaan02_03 mhs = new percobaan02_03();

        mhs.inputNilai(100, 100, 100);
        mhs.tampilkanNilai();
        System.out.println("Nilai Akhir : " + mhs.nilaiAkhir());
    }
}
