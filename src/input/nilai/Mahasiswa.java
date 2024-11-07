/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input.nilai;

/**
 *
 * @author acer
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, Matkul, Nilai_Akhir;
    public Mahasiswa(String NIM, String Nama, String Alamat, String Matkul, String Nilai_Akhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matkul = Matkul;
        this.Nilai_Akhir = Nilai_Akhir;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return Nama;
    }
    
    public String getMatkul() {
        return Matkul;
    }
    
    public String getNilaiAkhir() {
        return Nilai_Akhir;
    }
}
