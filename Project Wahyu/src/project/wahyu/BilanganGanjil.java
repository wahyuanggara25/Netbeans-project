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
public class BilanganGanjil {
    public static void main(String[] args) {
        Scanner masukan= new Scanner(System.in);
        System.out.println("Masukan batas = ");
        int b = masukan.nextInt();
        
        for (int i=1;i<=b;i++)
        {
            if(i%2==1)
                System.out.print(i+" ");
        }
  }
}