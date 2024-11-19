/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgvoid;

/**
 *
 * @author asus
 */
import java.util.Scanner;

class hitung {
  public int tinggi,a,b;
  public double luas;
  public void trapesium(){
  Scanner input = new Scanner (System.in);
      System.out.println("Masukkan nilai tinggi = ");
      tinggi=input.nextInt();
      System.out.println("Masukkan nilai A = ");
      a=input.nextInt();
      System.out.println("Masukkan nilai B = ");
      b=input.nextInt();
      luas= (0.5*tinggi)*(a+b);
      System.out.println("Luas Trapesium = "+luas);
  }
}
public class voidluas {
}
