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
public class bangunruang {
    int panjang,lebar,tinggi,sisi;
    int volumeb,volumek,volume;
    
    public static void main(String[] args) {
        kubus kbs=new kubus();
        balok blk= new balok();
        kerucut krct= new kerucut();
        
        kbs.volumekubus(3,4,9);
        blk.volumebalok(4,8,5);
        krct.volumekerucut(10,11,20);
        
    }
}
