/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.wahyu;

/**
 *
 * @author asus
 */

import java.util.Scanner;
public class Golongan {
    public static void main(String[] args) {
       int uang = 0;
        
        Scanner masukan= new Scanner(System.in);
        System.out.print("Inputkan Nama : ");
        String  nama = masukan.nextLine();
        
        System.out.print("Kode angka golongan Karyawan\n1.A\n2.B\n3.C\n4.D\nInput= :");
        int gol=masukan.nextInt();
      
         switch (gol){
             case 1 :System.out.println("Golongan A");break;
             case 2 :System.out.println("Golongan B");break;
             case 3 :System.out.println("Golongan C");break;
             case 4 :System.out.println("Golongan D");break;
             default : System.out.println("Dia Masih honorer");
         }
          if (gol==1)
              uang =  8000000;
          else if (gol==2)
              uang = 5000000;
          else if (gol==3)
              uang = 3000000;
          else if (gol==4)
              uang = 1000000;
          else
              uang=0;
          
          System.out.println("nama = " +nama);   
          System.out.println("gaji = "+uang);
    }
}
