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

public class induk extends ikan {
     
    public void namaidk(){

        System.out.println("Induk");
        System.out.println("Nama Ikan     = Martin"+nama);
         }
    public void warnaidk(){

        System.out.println("warna ikan    = Oren"+warna);
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


