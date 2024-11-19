/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaline;

/**
 *
 * @author asus
 */
public class Main {
  
    public static void main(String[] args) {
        Adaline a = new Adaline();
        System.out.println("\n\nPengenalan pola AND");
        System.out.println("1 AND 1 hasilnya "+a.mapping(1, 1));
        System.out.println("1 AND -1 hasilnya "+a.mapping(1, -1));
        System.out.println("-1 AND 1 hasilnya "+a.mapping(-1, 1));
        System.out.println("-1 AND -1 hasilnya "+a.mapping(-1,-1));
    }
}

