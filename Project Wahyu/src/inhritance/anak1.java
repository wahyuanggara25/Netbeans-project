/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhritance;

/**
 *
 * @author asus
 */
public class anak1 extends ikan {
 
    public void namaidk(){
        System.out.println("Anak-1");
        System.out.println("Nama Ikan     = Martin"+nama);
         }

    public void warnaidk(){
       
        System.out.println("warna ikan    = oren"+warna);
    }
    public void jkidk(){
       
        System.out.println("Jenis Kelamin = Jantan"+jeniskelamin);
    }
    public void beratidk(){
        System.out.print("Masukkan Berat  = ");
        berat = masukan.nextInt();
        System.out.println("berat ikan    = "+berat +" gr");
    }
}
