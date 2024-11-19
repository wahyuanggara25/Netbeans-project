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
//loop
import java.util.Scanner;
public class pertemuan4 {
//    public static void main(String[] args) {
//    for(int i=4; i>=0;i--)
//            System.out.println(i);
// 
//}

    
    public static void main(String[] args) {
        Scanner masukan= new Scanner(System.in);
        String kata;
        System.out.println("Masukkan kata : "); 
        kata= masukan.nextLine();
        System.out.println("Masukkan jumlah : ");
        int jl=masukan.nextInt();
        
        for(int i=1;i<=jl;++i)
            System.out.println(kata);
            
    }
    
}