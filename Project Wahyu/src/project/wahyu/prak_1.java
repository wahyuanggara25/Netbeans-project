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
public class prak_1 {

    public static void main(String[]args)
    {
        int x=0,y=1;
        double hasil_jumlah=0,jumlah=0,total_jumlah=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Banyaknya data : ");
        x =input.nextInt();
        do
        {
            System.out.print("Data ke-"+y+ " = ");
            jumlah = input.nextInt();
            total_jumlah=total_jumlah + jumlah;
            y++;
        }
       while(y<=x);
        hasil_jumlah =total_jumlah / x;
        System.out.println("Rata-Rata =  "+hasil_jumlah);
    }
            
}
