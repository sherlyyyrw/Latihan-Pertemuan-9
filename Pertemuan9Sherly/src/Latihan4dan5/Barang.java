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
public class Barang extends BarangInheritance {
     int HPP,HargaJual,Stok,JumlahJual;
    
    public Barang (String kode, String nama, int HPP, int HargaJual, int Stok, int JumlahJual){
        super(kode,nama);
        this.HPP=HPP;
        this.HargaJual=HargaJual;
        this.Stok=Stok;
        this.JumlahJual=JumlahJual;
    }
    public String TampilBarang(){
        return (super.tampilBarang()+"HPP\t\t: "+HPP+"\nHarga Jual\t: "+HargaJual+
                "\nStok\t\t: "+Stok+"\nJumlah Jual\t: "+JumlahJual+"\nOUTPUT:"+"\nStok Sekarang\t:"
                +(Stok-JumlahJual)+"\nTotal Bayar\t: "+(JumlahJual*HargaJual)+ "\nLaba\t\t: "+((JumlahJual*HargaJual)-(JumlahJual*HPP)));
    }
}
