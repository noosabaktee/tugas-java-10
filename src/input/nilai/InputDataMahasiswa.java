/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input.nilai;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList ();
    }
    public void insertData(String NIM, String Nama, String Alamat, String Matkul, String Nilai_Akhir) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Matkul, Nilai_Akhir);
        listmahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa> getALL() {
        return listmahasiswa;
    }
    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
