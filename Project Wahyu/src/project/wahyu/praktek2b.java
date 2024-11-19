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
public class praktek2b {

   public static void main(String[]args)
   {
       Scanner input = new Scanner (System.in);
       String a;
       char b;
       int c = 0;
       
       System.out.print("Masukan Nama Anda     : ");
       a = input.nextLine();
       System.out.print("Masukan Golongan Anda : ");
       b = input.next().charAt(0);
       switch(b) {
           case 'A' :c=8000000;break;
           case 'B' :c=5000000;break;
           case 'C' :c=4000000;break;
           case 'D' :c=3000000;break;
           default  :{System.out.println("Nama : "+a);
                      System.out.println("Dia Masih Honorer");
                      }
       }
       System.out.println("======================Info Yang Di Dapat===================");
       System.out.println("Nama     : " +a);
       System.out.println("Golongan : " +b);
       System.out.printf("Gaji     : %d ",c );
       
       
   }  
}

