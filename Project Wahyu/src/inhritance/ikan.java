/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhritance;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class ikan {
    char nama,warna,jeniskelamin;
    int berat;
    Scanner masukan= new Scanner (System.in);
    
    public static void main(String[] args) {
        induk indukk = new induk ();
        indukk.namaidk();
        indukk.warnaidk();
        indukk.jkidk();
        indukk.beratidk();
        System.out.println("*******************");
        System.out.println("*******************");
        anak1 anakprtm = new anak1 ();
        anakprtm.namaidk();
        anakprtm.warnaidk();
        anakprtm.jkidk();
        anakprtm.beratidk();
        System.out.println("*******************");
        System.out.println("*******************");
        anak2 anakkd = new anak2 ();
        anakkd.namaidk();
        anakkd.warnaidk();
        anakkd.jkidk();
        anakkd.beratidk();
        System.out.println("*******************");
        System.out.println("*******************");
        anak3 anakktg = new anak3();
        anakktg.namaidk();
        anakktg.beratidk();
        System.out.println("*******************");
        System.out.println("*******************");
  }

}