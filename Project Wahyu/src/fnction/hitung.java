/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnction;

import java.util.Scanner;
 class prsma {
  
    private double panjang, lebar, tinggi;
    public void volume_prisma_segitiga() {
        
        panjang();
        lebar();
        tinggi();
        Volume(panjang,lebar,tinggi);
    }

    private void Volume(double panjangVl, double lebarVl, double tinggiVl) {
        double volume = 0.5 * panjangVl * lebarVl * tinggiVl;
        System.out.println("Volume Prisma Segitiga Adalah = " + volume +" cm");
    }

    private void panjang () {
        System.out.print("Masukan panjang = ");
        Scanner input = new Scanner(System.in);
        double panjangVl = input.nextDouble();
        this.panjang = panjangVl;
    }

    private void lebar() {
        System.out.print("Masukan lebar = " );
        Scanner input = new Scanner(System.in);
        double lebarVl = input.nextDouble();
        this.lebar = lebarVl;
    }

    private void tinggi() {
        System.out.print("Masukan tinggi = " );
        Scanner input = new Scanner(System.in);
        double tinggiVl = input.nextDouble();
        this.tinggi = tinggiVl;
    }
 }
  public class hitung{
 }


