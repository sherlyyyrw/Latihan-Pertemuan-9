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
public class Barang_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang bkgr =new Barang ("B001", "Buku Gambar", 2500, 3000, 5, 2);
        Barang pns =new Barang ("P002", "Pensil 2B", 1500, 1750, 10, 1);
        System.out.println(bkgr.TampilBarang());
        System.out.println("---------------------------------------------");
        System.out.println(pns.TampilBarang());
    }
}
    
    

