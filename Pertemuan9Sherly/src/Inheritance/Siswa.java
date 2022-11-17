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
class Siswa {

    public class Siswa extends Pelajar {
    private final String nim,asalSekolah;
    private final long nilai;
    public Siswa(String nama,long tinggi, long berat,String nim,String asalSekolah,long nilai){
        super(nama,tinggi,berat);
        this.nim=nim;
        this.asalSekolah=asalSekolah;
        this.nilai=nilai;
    }
    
    public String tampilSiswa(){
        return (super.tampilPelajar()+"nim\t: "+nim+"\nAsalSekolah\t: "+asalSekolah+"\nNilai\t: "+nilai);
        }   
}
}
