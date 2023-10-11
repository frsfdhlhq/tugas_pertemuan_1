/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo2;

/**
 *
 * @author Rissfdh
 */
public class Nilai {
    String NIM;
    String Nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    
    public Nilai(String NIM, String Nama, int nilaiAbsen, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public void CetakNilai() {
        double nilaiAkhir = 0.1 * nilaiAbsen + 0.2 * nilaiTugas + 0.3 * nilaiUTS + 0.4 * nilaiUAS;

        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen[10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
