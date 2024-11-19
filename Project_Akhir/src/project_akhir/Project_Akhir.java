/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir;

import java.util.Scanner;

public class Project_Akhir {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mp;
        int Array[]=null, jp=0;
        String[] nohp = new String[99];
        String[] nama = new String[99];
        String[] almt = new String[99]; 
        String[] pk = new String[99];
        System.out.println("----------------------------------------------------");
        System.out.println("           KURSUS MENGEMUDI ELITE GLOBAL            ");
        System.out.println("----------------------------------------------------\n");
        System.out.println("=================KATEGORI KURSUS====================");
        System.out.println("1. 10 JAM MATIC    : Rp450.000");
        System.out.println("2. 10 JAM MANUAL   : Rp500.000");
        System.out.println("3. 15 JAM MATIC    : Rp650.000");
        System.out.println("4. 15 JAM MANUAL   : Rp700.000\n");
        System.out.println("====================MENU UTAMA======================");
        System.out.println("1. Registrasi");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Keluar\n");
        
        do{
            System.out.print("Masukkan Pilihan : ");
            mp = input.nextInt();
            System.out.println();
        
        switch (mp) {
            case 1:
                System.out.println("=====================REGISTRASI=====================");
                System.out.print("Masukkan Jumlah Pendaftar : ");
                jp = input.nextInt();
                System.out.println();
                
                 Array = new int [jp];
             for(int x=1; x<=jp; x++){
                 System.out.println("Data Pendaftar Ke-"+x);
                 System.out.print("Nama                 : ");
                    nama[x-1] = input.next();   
                 System.out.print("No Hp                : ");
                    nohp[x-1] = input.next(); 
                 System.out.print("Alamat               : ");
                    almt[x-1] = input.next();
                 System.out.print("Pilih Kategori       : ");
                    pk[x-1] = input.next();
                    
                    if (pk[x-1].equalsIgnoreCase("1")) {
                        System.out.println("TOTAL PEMBAYARAN    : Rp450.000\n");}
                    else if (pk[x-1].equalsIgnoreCase("2")){
                        System.out.println("TOTAL PEMBAYARAN    : Rp500.000\n");}
                    else if (pk[x-1].equalsIgnoreCase("3")){
                        System.out.println("TOTAL PEMBAYARAN    : Rp650.000\n");}
                    else if (pk[x-1].equalsIgnoreCase("4")){
                        System.out.println("TOTAL PEMBAYARAN    : Rp700.000\n");}
                    else{                       
                    }}
                System.out.println();
               break;
            case 2:
                 System.out.println("==================DATA PENDAFTAR====================\n");
                for (int x=1; x<=jp; x++){
                System.out.println("Data Pendaftar Ke-"+x);
                System.out.println("Nama                : "+nama[x-1]);
                System.out.println("No Hp               : "+nohp[x-1]);
                System.out.println("Alamat              : "+almt[x-1]);
                System.out.println("Kategori            : "+pk[x-1]);
                
                if (pk[x-1].equalsIgnoreCase("1")) {
                        System.out.println("TOTAL PEMBAYARAN    : Rp450.000\n");}
                    else if (pk[x-1].equalsIgnoreCase("2")){
                        System.out.println("TOTAL PEMBAYARAN    : Rp500.000\n");}
                    else if (pk[x-1].equalsIgnoreCase("3")){
                        System.out.println("TOTAL PEMBAYARAN    : Rp650.000\n");}
                    else if (pk[x-1].equalsIgnoreCase("4")){
                        System.out.println("TOTAL PEMBAYARAN    : Rp700.000\n");}
                    else{
                    }}
                 break; 
            case 3:
                System.out.println("------------------------------------------------------");
                System.out.println("~~~~~~Terima Kasih:)~~~~~~~~");
                break;
            default:        
                System.err.println("Pilihan Anda Salah!!\n");
        }}
            while (mp!=3);     
}}

