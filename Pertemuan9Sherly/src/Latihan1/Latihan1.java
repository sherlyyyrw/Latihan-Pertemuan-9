/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan1;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String input,input2;
        input=JOptionPane.showInputDialog("Masukan Angka Pertama");
        input2=JOptionPane.showInputDialog("Masukan Angka Kedua");
        String Total =input+"+"+input2+"="+(parseInt(input)+parseInt(input2));
        JOptionPane.showMessageDialog(null,Total);
        
    }  
}
    
    

