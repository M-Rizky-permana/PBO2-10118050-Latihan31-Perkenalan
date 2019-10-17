/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas31;

/**
 *
 * @author Asus
 */
public class Tugas31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();
        
        mhs1.perkenalkanDiri();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        
        mhs2.setNim("10110271");
        mhs2.setNama("Indra Tiola");
        
        
        System.out.println("My Nim is "+mhs1.getNim());
        System.out.println("My Name is "+mhs1.getNama());
        System.out.println();
        
        mhs2.perkenalkanDiri();
        System.out.println("My Nim is "+mhs2.getNim());
        System.out.println("My Name is "+mhs2.getNama());
    }
    
}
