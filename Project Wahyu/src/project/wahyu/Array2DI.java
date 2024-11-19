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
public class Array2DI {
    public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
int Array[]=null, menu, n=0;
     
    System.out.println("== Menu Utama ==");
    System.out.println("1. Input Data");
    System.out.println("2. Tampilkan Data");
    System.out.println("3. Distribusi Frekuensi");
    System.out.println("4. Statistik");
    System.out.println("5. Keluar\n");
    System.out.println("-------------------------------------------------");
    do{ 
       System.out.print("Masukkan menu yang Anda pilih : ");
       menu=masukan.nextInt();
       switch(menu){
          case 1:
             System.out.println("# 1. Input Data");
             System.out.print("\tInput banyak data : ");
             n=masukan.nextInt();
             Array = new int [n];
             for(int x=1; x<=n; x++){
                 System.out.print("\tData ke-" +x+" : ");
                 Array[x-1]=masukan.nextInt();
             }
             System.out.println();
             break;

          case 2:
             System.out.println("# 2. Tampilkan Data");
             for (int x=1; x<=n; x++){
                 System.out.print(+Array[x-1]+", ");
             }
             System.out.println("\n");
             break;

          case 3:
             System.out.println("# 3. Distribusi Frekuensi");
             int range_1=0, range_2=0, range_3=0, range_4=0, range_5=0; //100 : interval 20 = 5 range
             for (int x=1; x<=n; x++){
                 if (Array[x-1]>=0 && Array [x-1]<=20){
                     range_1++;
                 }
                 else if(Array[x-1]>20 && Array[x-1]<=40){
                     range_2++;
                 }
                 else if(Array[x-1]>40 && Array[x-1]<=60){
                     range_3++;
                 }
                 else if(Array[x-1]>60 && Array[x-1]<=80){
                     range_4++;
                 }
                 else if(Array[x-1]>80 && Array[x-1]<=100){
                    range_5++;
                 }
            }
            System.out.print("\tFrekuensi data antara 0-20 adalah : " +range_1 +"\n");
            System.out.print("\tFrekuensi data antara 20-40 adalah : " +range_2 +"\n");
            System.out.print("\tFrekuensi data antara 40-60 adalah : " +range_3 +"\n");
            System.out.print("\tFrekuensi data antara 60-80 adalah : " +range_4 +"\n");
            System.out.print("\tFrekuensi data antara 80-100 adalah : " +range_5 +"\n\n");
            break;

          case 4:
             System.out.println("# 4. Statistik");
             double total=0;
             for (int x=1; x<=n; x++){
                 total+= Array[x-1];
             }
             double mean=total/n;
             System.out.print("\tmean data tersebut adalah : " +mean +"\n");
             int min=Array[0], max=Array[0];
             for(int x=1; x<=n; x++){
                 if(Array[x-1]<min){
                    min=Array[x-1];
                 }
                 if(Array[x-1]>max){
                    max=Array[x-1];
                 }
             }
             System.out.print("\tNilai minimumnya adalah : "+min +"\n");
             System.out.print("\tNilai maksimumnya adalah : "+max +"\n\n");
             break;
                  
          case 5:
             break;
          default:
             System.err.println(".");
           
            }
        }
    while (menu!=5);
        System.out.println("-----------------\nTerima Kasih.\nProgram Selesai.");
    }
}
    

