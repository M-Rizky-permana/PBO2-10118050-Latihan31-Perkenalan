/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas31;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class Mahasiswa {
    private String Nim;
    private String Nama;
    
    public String getNim(){
        return Nim;
    }
    
    public void setNim(String Nim){
        this.Nim = Nim;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void perkenalkanDiri(){
        System.out.println("Hallo Everyone");
    }
    
}
