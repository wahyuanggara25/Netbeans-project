/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_pbo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class main_function extends main{
   String reset = "\u001B[0m";
    String merah = "\u001B[31m";
    String[][] buku = 
    {
        {
            "Diary Garpu Tala",
            "The Other Side",
            "Kartun Kimia 2020",
            "Kartun Fisika 2020",
            "Detektif Connan 96",
            "Mantra Orang Jawa"
        },
        {
            "125000",
            "89000",
            "75000",
            "75000",
            "25000",
            "70000"
        },
        {
            "0",
            "0",
            "24",
            "24",
            "20",
            "20"
        }
    };
    String[][] keranjang=new String[6][6];
    int no,jumlah,total,satuan,harga,sebelum_diskon,diskon;
    int index;
    String error="";

    public void list_buku(){
         System.out.println("List Buku");
        for (int i = 0; i < buku[0].length; i++) {
            System.out.println((i+1)+" judul : "+buku[0][i]);
            System.out.println("  Harga : "+format_rupiah(Integer.parseInt(buku[1][i])));
            System.out.println("  Diskon: "+buku[2][i]+"%");
        }
        System.out.println("____");
    }
    public void list_keranjang(){
        no=1;
        jumlah=0;
        total=0;
        System.out.println("List Keranjang:");
        System.out.println("-------------------------------------------");
        System.out.println("No|\t Nama \t\t | qtt \t | Harga");
        System.out.println("-------------------------------------------");
        for (String value : keranjang[0]) {
            if(value != null) {
                index=Integer.parseInt(value);
                satuan=Integer.parseInt(keranjang[1][index]);
                harga=Integer.parseInt(buku[1][index]);
                diskon=Integer.parseInt(buku[2][index]);
                System.out.println(no+".| "+buku[0][index]+" \t | "+satuan+" \t | "+format_rupiah(harga));
                jumlah+=satuan;
                sebelum_diskon=harga*satuan;
                diskon=sebelum_diskon*diskon/100;
                total+=(sebelum_diskon-diskon);
                no++;
            }
        }
        if(no!=1){
            System.out.println("-------------------------------------------");
            System.out.println("Jumlah buku   = "+jumlah);
            System.out.println("Total belanja = "+ format_rupiah(total));
        }
        else
            System.out.println("Keranjang Kosong");
        System.out.println("______");
    }
    public boolean hitung(){
        no=1;
        jumlah=0;
        total=0;
        System.out.println("Pembelian:");
        System.out.println(merah+error+reset);
        for (String value : keranjang[0]) {
            if(value != null) {
                index=Integer.parseInt(value);
                satuan=Integer.parseInt(keranjang[1][index]);
                harga=Integer.parseInt(buku[1][index]);
                diskon=Integer.parseInt(buku[2][index]);
                System.out.println(satuan+" "+buku[0][index]+" \t\t "+format_rupiah(harga));
                jumlah+=satuan;
                sebelum_diskon=harga*satuan;
                if(diskon!=0) diskon=sebelum_diskon*diskon/100;
                total+=(sebelum_diskon-diskon);
                no++;
            }
        }
        if(no!=1){
            System.out.println("-------------------------------------------");
            System.out.println("\t\t Total belanja : "+ format_rupiah(total));
            return true;
        }
        return false;
    }
    public boolean pembayaran(String bayar){
        int sisa=Integer.parseInt(bayar)-total;
        if(sisa>=0){
            System.out.println("\t\t     Kembalian : "+ format_rupiah(sisa));
            error="";
            return true;
        }
        error="*Uang Anda Kurang";
        return false;
    }
    public void add_keranjang(String pilih){
        for (int i = 1; i <=6; i++) {
            if(pilih.equals(String.valueOf(i))){
                index=Integer.parseInt(pilih)-1;
                if(keranjang[0][index] == null){
                    keranjang[0][index]=String.valueOf(index);
                    keranjang[1][index]="1";
                }
                else{
                    jumlah = Integer.parseInt(keranjang[1][index])+1;
                    keranjang[1][index]=String.valueOf(jumlah);
                }
                break;
            }
        }
    }
    public void clear() {
        for (int y = 0; y < 25; y++)
        System.out.println("\n");
    }
}