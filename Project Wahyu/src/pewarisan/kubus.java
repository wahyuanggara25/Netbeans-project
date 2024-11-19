/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author asus
 */
public class kubus extends bangunruang {
    private int volumek;
    public  void volumekubus (int panjang, int lebar, int tinggi){
        
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
        
        volumek=panjang*lebar*tinggi;
        
            System.out.println("Volune Kubus : "+volumek);
    }
}
