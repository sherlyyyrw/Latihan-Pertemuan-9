/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author User
 */
class Pelajar {
    private String nama;
    private Long tinggi;
    private Long berat;
    
    public Pelajar (String nama, long tinggi, long berat){
        this.nama=nama;
        this.tinggi=tinggi;
        this.berat=berat;
    }
    
    public String tampilPelajar(){
        return ("Nama\t: "+nama+"\nTinggi\t: "+tinggi+"\nBerat\t: "+berat+"\n");
    }
}

