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
public class balok extends bangunruang{
    private int volumeb;
    public void volumebalok(int panjang, int lebar,int tinggi){
        this.panjang=panjang;
         this.lebar=lebar;
         this.tinggi=tinggi;
         
         volumeb=panjang*lebar*tinggi;
         
            System.out.println("Voluen Balok : "+volumeb);
    }
}
