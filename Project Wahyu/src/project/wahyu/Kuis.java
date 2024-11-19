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
public class Kuis {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan banyak bilangan: ");
        int banyakBil = masukan.nextInt();
        int bilangan[] = new int[banyakBil];

        for(int x=0; x<bilangan.length; x++) {
            System.out.print("Masukan bilangan ke" + (x+1) + ": ");
            bilangan[x] = masukan.nextInt();

            int menu = bilangan[x] % 2;

            switch (menu) {
                case 0:
                    if(bilangan[x] > 0)
                    System.out.println("Bilangan Genap Positif");
                    else
                        System.out.println("Bilangan Genap Negatif");
                    break;
                case 1:
                    if(bilangan[x]>0) {
                        System.out.println("Bilangan Ganjil Positif");
                    } else {
                        System.out.println("Bilangan Ganjil Negatif");
                    }
                    break;
                default:
                    System.out.println("Data tidak dikenal");
            }

          }
         }
}  