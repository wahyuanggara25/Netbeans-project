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
public class contohwhile {
    public static void main(String[] args) {
      Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan nilai Awal : ");
        int i=masukan.nextInt();
        System.out.println("Masukkan nilai Batas : ");
        int j =masukan.nextInt();
        while (i<j){
            System.out.println(i);
            i++;
    }
}
}