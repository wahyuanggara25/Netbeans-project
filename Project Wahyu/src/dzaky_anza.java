
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class dzaky_anza {
    public static void main(String[] args) { 
Scanner input = new Scanner(System.in);
int n,total,rata2;
total = 0;
        System.out.println("PROGRAM MENAMPILKAN RATA RATA NILAI N");
        System.out.println("-------------------------------------");
        System.out.println("input nilai akhir atau n : ");
        n = input.nextInt();
        for(int i = 1;i <-n;i++){
            System.out.println(i);
            if(i < n){
                System.out.println(",");
            }
            total += i;
        }
        rata2 = total/n;
        System.out.println("\n------------------------------");
        System.out.println("Rata - Rata : "+rata2);
        System.out.println("-------------------------------");
            }
        }
