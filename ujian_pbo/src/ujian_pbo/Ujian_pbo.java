/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_pbo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.Scanner;

public class Ujian_pbo {
   public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String pilih,harga;
        boolean check=false;
        main_function mf = new main_function();
        while(true){
            mf.list_buku();
            mf.list_keranjang();
            System.out.print("Pilih buku (1-6)|batal(b)|hitung(h): ");
            pilih = input.nextLine();
            if(pilih.equals("b")){
                System.out.println("Pembelian Dibatalkan");
                break;
            }
            else if(pilih.equals("h")){
                while(true){
                    mf.clear();
                    if(mf.hitung()){
                        check=true;
                        System.out.print("\t\t    Pembayaran : ");
                        harga = input.nextLine();
                        if(mf.pembayaran(harga)) break;
                    }
                    else
                        break;
                }
                if(check)break;
            }
            else{
                mf.add_keranjang(pilih);
            }
            mf.clear();
        }
    }
}