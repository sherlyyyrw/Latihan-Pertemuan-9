/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan4dan5;

/**
 *
 * @author User
 */
public class BarangInheritance {
     private String kode;
    private String nama;
   
    
 public BarangInheritance (String kode, String nama){
     this.kode= kode;
     this.nama = nama;
    
 }
 public String tampilBarang(){
     return 
("INPUT:\nKde\t\t: " +kode+ "\nNama\t\t: "+nama+"\n");
    }    
}

